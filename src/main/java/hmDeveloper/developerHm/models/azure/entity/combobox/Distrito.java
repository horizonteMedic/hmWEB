package hmDeveloper.developerHm.models.azure.entity.combobox;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ubigeo_distrito")
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_distrito_ubigeo", length = 6)
    private String id;

    @Column(name = "nombre_distrito", length = 50)
    private String nombre;

    @Column(name = "id_departamento_ubigeo", length = 2)
    private String idDepartamento;

    @Column(name = "id_provincia_ubigeo", length = 4)
    private String idProvincia;
}
