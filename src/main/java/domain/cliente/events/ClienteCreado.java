package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.Historial;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Contacto;
import domain.cliente.values.Direccion;
import domain.cliente.values.Nombre;


public class ClienteCreado extends DomainEvent {
    private final Nombre nombre;
    private final Contacto contacto;
    private final Direccion direccion;
    private final Historial historial;

    public ClienteCreado( Nombre nombre, Contacto contacto, Direccion direccion, Historial historial) {
        super("gym.cliente.clientecreado");
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.historial = historial;
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
