package hmDeveloper.developerHm.models.repository.asistencial;

import hmDeveloper.developerHm.models.entity.asistencial.DatosPaciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDatosPacienteRepository extends JpaRepository<DatosPaciente,String> {
}
