package hmDeveloper.developerHm.models.services.asistencial;

import hmDeveloper.developerHm.models.dtos.asistencial.ContrataDTO;

import java.util.List;

public interface IContrataService {
    ContrataDTO crearContrata(ContrataDTO contrataDTO);
    List<ContrataDTO> listadoContratas();
    ContrataDTO obtenerContrataPorRuc(String ruc);
    ContrataDTO actualizarContrata(ContrataDTO contrataDTO, String ruc);
    void eliminarContrata(String ruc);
}
