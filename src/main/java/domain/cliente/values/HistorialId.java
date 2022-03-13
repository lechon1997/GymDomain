package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

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
