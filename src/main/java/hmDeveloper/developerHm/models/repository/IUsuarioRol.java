package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRol extends JpaRepository<UsuarioRol,Long> {
}
