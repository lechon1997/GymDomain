package domain.cliente.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.command.NuevoRegistroHistorial;

public class AgregarHistorialDeRegistroUseCase extends UseCase<RequestCommand<NuevoRegistroHistorial>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<NuevoRegistroHistorial> input) {
        var command = input.getCommand();
        var cliente = Cliente.from(command.getClienteId(), retrieveEvents());
        try {
            cliente.nuevoRegistroHistorial(command.getRegistro());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getClienteId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
