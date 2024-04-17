package hmDeveloper.developerHm.models.repository.asistencial;

import hmDeveloper.developerHm.models.entity.asistencial.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IHistoriaClinicaRepository extends JpaRepository<HistoriaClinica,String> {

    @Query(value = "select CAST((COUNT(N_ORDEN)  +10001) AS TEXT) as n_orden from historia_clinica;", nativeQuery=true)
    String nroHistoriaClinicaRegistrar();
}
