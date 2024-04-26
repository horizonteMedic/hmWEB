package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.SedeHmWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISedeHmRepository extends JpaRepository<SedeHmWeb,Long> {
}
