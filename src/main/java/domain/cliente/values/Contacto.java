package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Contacto implements ValueObject<String> {
    private String celular;
    private String telefono;
    private String correo;

    @Override
    public String value() {
        return null;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

}
