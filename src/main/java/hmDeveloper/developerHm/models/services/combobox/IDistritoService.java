package hmDeveloper.developerHm.models.services.combobox;

import hmDeveloper.developerHm.models.dtos.combobox.DistritoDTO;

import java.util.List;

public interface IDistritoService {
    DistritoDTO crearDistrito(DistritoDTO distritoDTO);
    List<DistritoDTO> listadoDistritoPorProvincia(String idProvincia);
    List<DistritoDTO> listadoDistritos();
    DistritoDTO obtenerDistritoPorID(String id);
    DistritoDTO actualizarDistrito(DistritoDTO distritoDTO, String id);
    void eliminarDistrito(String id);
}
