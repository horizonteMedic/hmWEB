package hmDeveloper.developerHm.models.azure.repository;

import hmDeveloper.developerHm.models.azure.entity.EmpresaWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmpresaWebRepository extends JpaRepository<EmpresaWeb,Long> {

}
