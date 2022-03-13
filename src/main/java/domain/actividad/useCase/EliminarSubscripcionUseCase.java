package domain.actividad.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.actividad.Actividad;
import domain.actividad.command.EliminarSubscripcion;

public class EliminarSubscripcionUseCase extends UseCase<RequestCommand<EliminarSubscripcion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarSubscripcion> input) {
        var command = input.getCommand();
        var actividad = Actividad.from(command.getActividadId(), retrieveEvents());
        try{
            actividad.eliminarSubscripcion(command.getClienteId());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getActividadId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(actividad.getUncommittedChanges()));
    }
}
