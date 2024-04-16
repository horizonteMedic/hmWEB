package hmDeveloper.developerHm.models.repository.parametros;

import hmDeveloper.developerHm.models.entity.parametros.DetalleParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleParametrosRepository extends JpaRepository<DetalleParametros,Long> {
}
