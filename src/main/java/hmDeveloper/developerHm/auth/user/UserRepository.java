package hmDeveloper.developerHm.auth.user;

import hmDeveloper.developerHm.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario,Long> {
   // @Query(value = "SELECT * FROM users WHERE username=:nombre;", nativeQuery=true)
    Optional<Usuario> findByUsername(String username);
}
