package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.RolDTO;
import hmDeveloper.developerHm.models.dtos.SedeDTO;

import java.util.List;

public interface ISedeService {
    SedeDTO crearSede(SedeDTO sedeDTO);
    List<SedeDTO> listadoSedes();
    SedeDTO obtenerSedePorID(long id);
    SedeDTO actualizarSede(SedeDTO sedeDTO, long id);
    void eliminarSede(long id);
}
