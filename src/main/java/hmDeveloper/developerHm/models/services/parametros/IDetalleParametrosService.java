package hmDeveloper.developerHm.models.services.parametros;

import hmDeveloper.developerHm.models.dtos.parametros.DetalleParametrosDTO;

import java.util.List;

public interface IDetalleParametrosService {
    DetalleParametrosDTO crearDetalleParametros(DetalleParametrosDTO detalleParametrosDTO);
    List<DetalleParametrosDTO> listadoDetalleParametros();
    DetalleParametrosDTO obtenerDetalleParametrosPorID(Long id);
    DetalleParametrosDTO actualizarDetalleParametros(DetalleParametrosDTO detalleParametrosDTO, Long id);
    void eliminarDetalleParametro(Long id);

}
