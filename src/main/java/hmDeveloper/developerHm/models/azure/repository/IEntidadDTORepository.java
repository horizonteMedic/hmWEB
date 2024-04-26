package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.EntidadDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IEntidadDTORepository extends JpaRepository<EntidadDTO,Long> {
    @Query(value = "select *from listado_empresa_contrata()", nativeQuery=true)
    Optional<List<EntidadDTO>> listadoContrataEmpresasHM();

}
