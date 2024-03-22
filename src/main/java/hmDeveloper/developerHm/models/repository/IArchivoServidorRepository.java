package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.ArchivosServidor;
import hmDeveloper.developerHm.models.entity.DetalleHistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IArchivoServidorRepository extends JpaRepository<ArchivosServidor,Long> {

    @Query(value = "select *from archivos_servidores where historia_clinica=? and id_tipo_archivo=?;", nativeQuery=true)
    Optional<ArchivosServidor> detalleArchivoServidor(long hc, long ta);

}
