package domain.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.cliente.events.ClienteCreado;
import domain.cliente.events.RegistroHistorialAgregado;
import domain.cliente.values.*;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Nombre nombre;
    protected Contacto contacto;
    protected Direccion direccion;
    protected Historial historial;

    public Cliente(ClienteId entityId, Nombre nombre, Contacto contacto, Direccion direccion, Historial historial) {
        super(entityId);
        appendChange(new ClienteCreado(nombre, contacto, direccion, historial)).apply();
    }

    private Cliente(ClienteId clienteId){
        super(clienteId);
        subscribe(new ClienteChange(this));
    }

    public void nuevoRegistroHistorial(Registro registro){
        appendChange(new RegistroHistorialAgregado(registro)).apply();
    }

}
