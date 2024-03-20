package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.SedeHmWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISedeHm  extends JpaRepository<SedeHmWeb,Long> {
}
