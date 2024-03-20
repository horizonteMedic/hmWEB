package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.ArchivoServidorDTO;

import java.util.List;

public interface IArchivoServidorService {
    ArchivoServidorDTO creararchivoServidor(ArchivoServidorDTO archivoServidorDTO);
    List<ArchivoServidorDTO> listadoArchivoServidor();
    ArchivoServidorDTO obtenerArchivoServidorPorID(long id);
    ArchivoServidorDTO actualizarArchivoServidor(ArchivoServidorDTO archivoServidorDTO, long id);
    void eliminarArchivoServidor(long id);
}
