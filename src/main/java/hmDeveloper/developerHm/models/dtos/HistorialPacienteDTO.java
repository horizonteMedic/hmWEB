package hmDeveloper.developerHm.models.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialPacienteDTO {

    private Long dni;

    private String apellidos;

    private String nombres;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaExamen;
}
