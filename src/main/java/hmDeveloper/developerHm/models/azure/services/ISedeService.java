package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.SedeDTO;

import java.util.List;

public interface ISedeService {
    SedeDTO crearSede(SedeDTO sedeDTO);
    List<SedeDTO> listadoSedes();
    SedeDTO obtenerSedePorID(long id);
    SedeDTO actualizarSede(SedeDTO sedeDTO, long id);
    void eliminarSede(long id);
}
