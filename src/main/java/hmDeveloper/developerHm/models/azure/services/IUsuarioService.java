package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioDTO> listadoUsuario();
    UsuarioDTO obtenerUsuarioPorID(long id);
    UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO, long id);
    void eliminarUsuario(long id);
}
