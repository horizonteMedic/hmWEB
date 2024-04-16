package hmDeveloper.developerHm.models.services.parametros;

import hmDeveloper.developerHm.models.dtos.parametros.ListaParametrosDTO;

import java.util.List;

public interface IListaParametrosService {

    ListaParametrosDTO crearListadoParametros(ListaParametrosDTO listaParametrosDTO);
    List<ListaParametrosDTO> listadoParametros();
    ListaParametrosDTO obtenerListadoParametrosPorID(Long id);
    ListaParametrosDTO actualizarListaParametros(ListaParametrosDTO listaParametrosDTO, Long id);
    void eliminarListaParametros(Long id);
}
