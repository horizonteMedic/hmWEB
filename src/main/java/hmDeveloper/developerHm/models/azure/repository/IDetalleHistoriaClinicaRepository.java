package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.DetalleHistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDetalleHistoriaClinicaRepository extends JpaRepository<DetalleHistoriaClinica,Long> {
    @Query(value = "select *from listado_detalle_historia_clinica(:doc_identidad);", nativeQuery=true)
    Optional<List<DetalleHistoriaClinica>> listadoDetalleHistoriaClinica(Long doc_identidad);
}
