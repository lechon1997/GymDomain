package domain.cliente.command;

import co.com.sofka.domain.generic.Command;
import domain.cliente.Historial;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Contacto;
import domain.cliente.values.Direccion;
import domain.cliente.values.Nombre;

public class CrearCliente extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Contacto contacto;
    private final Direccion direccion;
    private final Historial historial;

    public CrearCliente(ClienteId clienteId, Nombre nombre, Contacto contacto, Direccion direccion, Historial historial) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.historial = historial;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Historial getHistorial() {
        return historial;
    }
}
