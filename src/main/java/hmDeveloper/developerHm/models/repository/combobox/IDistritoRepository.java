package hmDeveloper.developerHm.models.repository.combobox;

import hmDeveloper.developerHm.models.entity.combobox.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito,String> {
    @Query(value = "select *from ubigeo_distrito where id_provincia_ubigeo=?;", nativeQuery=true)
    Optional<List<Distrito>> listadoDistritoPorProvincia(String idProvincia);
}
