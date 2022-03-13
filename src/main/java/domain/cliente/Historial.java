package domain.cliente;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.values.HistorialId;
import domain.cliente.values.Registro;

import java.util.List;

public class Historial extends Entity<HistorialId> {
    protected List<Registro> registros;

    public Historial(HistorialId entityId, List<Registro> registros) {
        super(entityId);
        this.registros = registros;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void nuevoRegistro(Registro registro){
        this.registros.add(registro);
    }

    public List<Registro> listarRegistros(){
        return registros;
    }
}
