package hmDeveloper.developerHm.models.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
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
public class DetalleHistoriaClinicaDTO {

    private Long historiaClinica;

    private String empresa;

    private String contrata;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaApertura;

    private String examen;

    private String estado;

    private String cargo;

    private String area;

    private String grupoSanguineo;
}
