package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    public ClienteId(String uuid) {
        super(uuid);
    }

    public ClienteId() {
    }

    public static ClienteId of(String uuid){
        return new ClienteId();
    }
}
