package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.RolDTO;

import java.util.List;

public interface IRolService {
    RolDTO crearRol(RolDTO rolDTO);
    List<RolDTO> listadoRol();
    RolDTO obtenerRolPorID(long id);
    RolDTO actualizarRol(RolDTO rolDTO, long id);
    void eliminarRol(long id);
}
