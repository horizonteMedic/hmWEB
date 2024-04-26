package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.OpcionesInterfazPrivilegios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOpcionesInterfazPrivilegio extends JpaRepository<OpcionesInterfazPrivilegios,Long> {
}
