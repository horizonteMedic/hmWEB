package hmDeveloper.developerHm.models.services.combobox;

import hmDeveloper.developerHm.models.dtos.combobox.ProvinciaDTO;

import java.util.List;

public interface IProvinciaService {
    ProvinciaDTO crearProvincia(ProvinciaDTO provinciaDTO);
    List<ProvinciaDTO>ListadoProvinciaPorDepartamento(String idDepartamento);
    List<ProvinciaDTO> listadoProvincia();
    ProvinciaDTO obtenerProvinciaPorID(String id);
    ProvinciaDTO actualizarProvincia(ProvinciaDTO provinciaDTO, String id);
    void eliminarProvincia(String id);
}
