package domain.actividad.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.actividad.Actividad;
import domain.actividad.command.CrearActividad;

public class CrearActividadUseCase extends UseCase<RequestCommand<CrearActividad>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearActividad> input) {
        var command = input.getCommand();
        var actividad = new Actividad(command.getActividadId(), command.getNombreActividad(),
                command.getDescripcion(), command.getHorario());

        emit().onResponse(new ResponseEvents(actividad.getUncommittedChanges()));
    }
}
