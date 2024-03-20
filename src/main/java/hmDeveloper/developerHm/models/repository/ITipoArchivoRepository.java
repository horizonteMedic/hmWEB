package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.TipoArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoArchivoRepository extends JpaRepository<TipoArchivo,Long> {
}
