package hmDeveloper.developerHm.models.azure.repository.parametros;

import hmDeveloper.developerHm.models.azure.entity.parametros.ListaParametros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListaParametrosRepository extends JpaRepository<ListaParametros,Long> {


}
