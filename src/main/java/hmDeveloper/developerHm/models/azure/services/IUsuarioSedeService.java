package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.UsuarioSedeDTO;

import java.util.List;

public interface IUsuarioSedeService {

    UsuarioSedeDTO crearUsuarioSede(UsuarioSedeDTO usuarioSedeDTO);
    List<UsuarioSedeDTO> listadoUsuarioSedes();
    UsuarioSedeDTO obtenerUsuarioSedePorIDUSER(long id);

    List<UsuarioSedeDTO> ListaoUsuarioSedePorIDUSER(long id);

    UsuarioSedeDTO actualizarUsuarioSede(UsuarioSedeDTO usuarioSedeDTO, long id);
    void eliminarUsuarioSede(long id);
}
