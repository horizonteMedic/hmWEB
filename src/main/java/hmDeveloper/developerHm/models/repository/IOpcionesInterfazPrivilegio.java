package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.OpcionesInterfazPrivilegios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOpcionesInterfazPrivilegio extends JpaRepository<OpcionesInterfazPrivilegios,Long> {
}
