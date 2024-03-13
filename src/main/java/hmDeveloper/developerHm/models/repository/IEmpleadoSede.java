package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.EmpleadoSede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoSede extends JpaRepository<EmpleadoSede,Long> {
}
