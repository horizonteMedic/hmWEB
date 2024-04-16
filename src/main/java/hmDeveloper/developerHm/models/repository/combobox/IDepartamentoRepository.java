package hmDeveloper.developerHm.models.repository.combobox;

import hmDeveloper.developerHm.models.entity.combobox.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento,String> {
}
