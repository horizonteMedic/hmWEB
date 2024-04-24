package hmDeveloper.developerHm.models.repository;

import hmDeveloper.developerHm.models.entity.DetalleHistoriaClinica;
import hmDeveloper.developerHm.models.entity.UsuarioSede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioSedeRepository extends JpaRepository<UsuarioSede,Long> {
    @Query(value = "select *from usuario_sede where id_user=?", nativeQuery=true)
    Optional<List<UsuarioSede>> listadoUsuariosSedesPorIdUSER(Long idUser);
}
