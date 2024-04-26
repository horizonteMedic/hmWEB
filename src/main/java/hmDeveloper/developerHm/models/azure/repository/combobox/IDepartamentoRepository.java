package hmDeveloper.developerHm.models.azure.repository.combobox;

import hmDeveloper.developerHm.models.azure.entity.combobox.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento,String> {
}
