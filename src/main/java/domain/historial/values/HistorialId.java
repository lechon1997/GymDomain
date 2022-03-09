package domain.historial.values;

import co.com.sofka.domain.generic.Identity;
import domain.cliente.values.ClienteId;

public class HistorialId extends Identity {
    public HistorialId(String uuid) {
        super(uuid);
    }

    public HistorialId() {
    }

    public static HistorialId of(String uuid){
        return new HistorialId();
    }
}
