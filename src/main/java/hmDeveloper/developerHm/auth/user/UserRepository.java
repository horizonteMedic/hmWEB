package hmDeveloper.developerHm.auth.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
   // @Query(value = "SELECT * FROM users WHERE username=:nombre;", nativeQuery=true)
    Optional<User> findByUsername(String username);
}
