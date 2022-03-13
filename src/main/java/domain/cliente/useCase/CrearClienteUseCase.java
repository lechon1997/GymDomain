package domain.cliente.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.command.CrearCliente;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCliente> input) {
        var command = input.getCommand();
        var cliente = new Cliente(command.getClienteId(), command.getNombre(),
                command.getContacto(), command.getDireccion(), command.getHistorial());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
