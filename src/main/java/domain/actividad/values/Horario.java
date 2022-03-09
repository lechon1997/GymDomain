package domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

public class Horario implements ValueObject<String> {
    private final Fecha fecha;
    private final Hora horainicio;
    private final Hora horaFin;

    public Horario(Fecha fecha, Hora horainicio, Hora horaFin) {
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horaFin = horaFin;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHorainicio() {
        return horainicio;
    }

    public Hora getHoraFin() {
        return horaFin;
    }

    @Override
    public String value() {
        return null;
    }
}
