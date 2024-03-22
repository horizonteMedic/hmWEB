package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.RolDTO;
import hmDeveloper.developerHm.models.dtos.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioDTO> listadoUsuario();
    UsuarioDTO obtenerUsuarioPorID(long id);
    UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO, long id);
    void eliminarUsuario(long id);
}
