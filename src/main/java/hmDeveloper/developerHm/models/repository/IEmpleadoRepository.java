package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository <Empleado,Long> {
}
