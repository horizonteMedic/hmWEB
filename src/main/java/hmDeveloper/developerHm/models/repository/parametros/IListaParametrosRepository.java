package hmDeveloper.developerHm.models.repository.parametros;

import hmDeveloper.developerHm.models.entity.parametros.ListaParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListaParametrosRepository extends JpaRepository<ListaParametros,Long> {


}
