package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.EmailDTO;
import hmDeveloper.developerHm.models.dtos.RespuestaBackendDTO;

public interface IEmailService {
    RespuestaBackendDTO enviarCorreo(EmailDTO emailDTO);

    RespuestaBackendDTO usarCodigoGeneradoValidar(String emailUser, String codigoGenerado);

    RespuestaBackendDTO actualizarUsuario(String emailUser, String codigoGenerado);
}
