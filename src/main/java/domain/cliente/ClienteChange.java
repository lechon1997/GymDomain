package domain.cliente;

import co.com.sofka.domain.generic.EventChange;
import domain.cliente.events.ClienteCreado;
import domain.cliente.events.RegistroHistorialAgregado;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event) -> {
            cliente.nombre = event.getNombre();
            cliente.contacto = event.getContacto();
            cliente.direccion = event.getDireccion();
            cliente.historial = event.getHistorial();
        });

        apply((RegistroHistorialAgregado event) -> {
            cliente.historial.registros.add(event.getRegistro());
        });
    }
}
