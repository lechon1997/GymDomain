package domain.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Contacto;
import domain.cliente.values.Direccion;
import domain.cliente.values.Nombre;
import domain.historial.Historial;

public class Cliente extends AggregateEvent<ClienteId> {
    protected Nombre nombre;
    protected Contacto contacto;
    protected Direccion direccion;
    protected Historial historial;

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

}
