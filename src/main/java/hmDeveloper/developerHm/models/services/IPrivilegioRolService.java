package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.PrivilegioRolDTO;

import java.util.List;

public interface IPrivilegioRolService {
    PrivilegioRolDTO crearPrivilegioRol(PrivilegioRolDTO privilegioRolDTO);
    List<PrivilegioRolDTO> listadoPrivilegioRol();
    PrivilegioRolDTO obtenerPrivilegioRolPorID(long id);
    PrivilegioRolDTO actualizarPrivilegioRol(PrivilegioRolDTO privilegioRolDTO, long id);
    void eliminarPrivilegioRol(long id);
}
