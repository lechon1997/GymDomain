package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Registro;

public class NuevoRegistroHistorial extends Command {
    private final ClienteId clienteId;
    private final Registro registro;

    public NuevoRegistroHistorial(ClienteId clienteId, Registro registro) {
        this.clienteId = clienteId;
        this.registro = registro;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Registro getRegistro() {
        return registro;
    }
}
