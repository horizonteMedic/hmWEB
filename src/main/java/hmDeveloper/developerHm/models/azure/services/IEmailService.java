package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.EmailDTO;
import hmDeveloper.developerHm.models.azure.dtos.RespuestaBackendDTO;

public interface IEmailService {
    RespuestaBackendDTO enviarCorreo(EmailDTO emailDTO);

    RespuestaBackendDTO usarCodigoGeneradoValidar(String emailUser, String codigoGenerado);

    RespuestaBackendDTO actualizarUsuario(String emailUser, String codigoGenerado);
}
