package hmDeveloper.developerHm.models.azure.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespuestaBackendDTO {
    private Long id;

    private String mensaje;
}
