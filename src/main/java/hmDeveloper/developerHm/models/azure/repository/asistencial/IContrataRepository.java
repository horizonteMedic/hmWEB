package hmDeveloper.developerHm.models.azure.repository.asistencial;

import hmDeveloper.developerHm.models.azure.entity.asistencial.Contrata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContrataRepository extends JpaRepository<Contrata,String> {
}
