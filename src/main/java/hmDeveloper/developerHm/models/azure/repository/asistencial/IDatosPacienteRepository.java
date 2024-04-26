package hmDeveloper.developerHm.models.azure.repository.asistencial;

import hmDeveloper.developerHm.models.azure.entity.asistencial.DatosPaciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDatosPacienteRepository extends JpaRepository<DatosPaciente,String> {
}
