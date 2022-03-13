package domain.actividad.useCase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.actividad.Actividad;
import domain.actividad.command.AgregarNuevaSubscripcion;
import domain.actividad.values.ActividadId;

public class AgregarNuevaSubscripcionUseCase extends UseCase<RequestCommand<AgregarNuevaSubscripcion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarNuevaSubscripcion> input) {
        var command = input.getCommand();
        var actividad = Actividad.from(command.getActividadId(), retrieveEvents());
        try {
            actividad.nuevaSubscripcion(command.getClienteId());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getActividadId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(actividad.getUncommittedChanges()));
    }
}
