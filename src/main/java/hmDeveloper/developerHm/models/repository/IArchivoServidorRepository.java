package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.ArchivosServidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArchivoServidorRepository extends JpaRepository<ArchivosServidor,Long> {

}
