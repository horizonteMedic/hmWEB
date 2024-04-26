package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.TipoArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoArchivoRepository extends JpaRepository<TipoArchivo,Long> {
}
