package hmDeveloper.developerHm.models.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private long idUser;

    private String username;

    private String password;

    private Boolean estado;

    private long id_empleado;
}
