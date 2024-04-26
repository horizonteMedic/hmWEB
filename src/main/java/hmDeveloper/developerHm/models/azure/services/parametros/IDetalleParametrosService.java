package hmDeveloper.developerHm.models.azure.services.parametros;

import hmDeveloper.developerHm.models.azure.dtos.parametros.DetalleParametrosDTO;

import java.util.List;

public interface IDetalleParametrosService {
    DetalleParametrosDTO crearDetalleParametros(DetalleParametrosDTO detalleParametrosDTO);
    List<DetalleParametrosDTO> listadoDetalleParametros();

    List<DetalleParametrosDTO> listadoDetalleParametrizablePorListaParametros(String descripcionParametro);
    DetalleParametrosDTO obtenerDetalleParametrosPorID(Long id);
    DetalleParametrosDTO actualizarDetalleParametros(DetalleParametrosDTO detalleParametrosDTO, Long id);
    void eliminarDetalleParametro(Long id);

}
