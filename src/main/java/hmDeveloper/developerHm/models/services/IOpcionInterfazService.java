package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.OpcionesInterfazDTO;

import java.util.List;

public interface IOpcionInterfazService {
    OpcionesInterfazDTO crearOpcionInterfaz(OpcionesInterfazDTO opcionesInterfazDTO);
    List<OpcionesInterfazDTO> listadoOpcionesInterfaz();
    OpcionesInterfazDTO obtenerOpcionInterdazPorID(long id);
    OpcionesInterfazDTO actualizarOpcionInterfaz(OpcionesInterfazDTO opcionesInterfazDTO, long id);
    void eliminarOpcionInterfaz(long id);
}
