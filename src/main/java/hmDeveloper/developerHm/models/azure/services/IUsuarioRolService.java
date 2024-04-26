package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.UsuarioRolDTO;

import java.util.List;

public interface IUsuarioRolService {
    UsuarioRolDTO crearUsuarioRol(UsuarioRolDTO usuarioRolDTO);
    List<UsuarioRolDTO> listadoUsuarioRol();
    UsuarioRolDTO obtenerUsuarioRolPorID(long id);
    UsuarioRolDTO actualizarUsuarioRolDTO(UsuarioRolDTO usuarioRolDTO, long id);
    void eliminarUsuarioRolDTO(long id);
}
