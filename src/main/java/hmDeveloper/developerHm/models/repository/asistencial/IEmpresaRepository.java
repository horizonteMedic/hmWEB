package hmDeveloper.developerHm.models.repository.asistencial;

import hmDeveloper.developerHm.models.entity.asistencial.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,String> {
}
