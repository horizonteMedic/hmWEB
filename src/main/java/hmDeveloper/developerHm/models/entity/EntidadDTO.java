package hmDeveloper.developerHm.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "entidad_dto")
public class EntidadDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_entidad")
    private Long id;

    @Column(name = "ruc", length = 11)
    private String ruc;

    @Column(name = "razon_social", length = 200)
    private String razonSocial;

}
