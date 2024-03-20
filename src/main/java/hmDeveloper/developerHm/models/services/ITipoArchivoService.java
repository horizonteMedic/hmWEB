package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.TipoArchivoDTO;

import java.util.List;

public interface ITipoArchivoService {
    TipoArchivoDTO crearTipoArchivo(TipoArchivoDTO tipoArchivoDTO);
    List<TipoArchivoDTO> listadoTipoArchivo();
    TipoArchivoDTO obtenerTipoArchivoPorID(long id);
    TipoArchivoDTO actualizarTipoArchivo(TipoArchivoDTO tipoArchivoDTO, long id);
    void eliminarTipoArchivo(long id);
}
