package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.PrivilegioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrivilegioRol extends JpaRepository<PrivilegioRol,Long> {
}
