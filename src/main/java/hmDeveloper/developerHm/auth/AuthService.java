package hmDeveloper.developerHm.auth;

import hmDeveloper.developerHm.auth.user.Role;
import hmDeveloper.developerHm.auth.user.UserRepository;
import hmDeveloper.developerHm.models.dtos.EmpleadoDTO;
import hmDeveloper.developerHm.models.entity.Empleado;
import hmDeveloper.developerHm.models.entity.Usuario;
import hmDeveloper.developerHm.models.jwt.JwtService;
import hmDeveloper.developerHm.models.services.EmpleadoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @Autowired
    private UserRepository usuarioRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        Usuario userd=usuarioRepository.findByUsername(request.getNombre()).orElseThrow();

        UserDetails user=usuarioRepository.findByUsername(request.getNombre()).orElseThrow();

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getNombre(), request.getPassword()));

        String token=jwtService.getToken(user,userd.getIdUser());
        return AuthResponse.builder()
                .token(token)
                .build();

    }

    public AuthResponse register(RegisterRequest request) {
        Usuario usuario=new Usuario();
        EmpleadoDTO empleadoDTO=new EmpleadoDTO();
        usuario.setUsername(request.getUsername());
        usuario.setEstado(request.getEstado());
        usuario.setRole(Role.USER);
        usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        empleadoDTO=empleadoService.obtenerEmpleadoPorID(request.getIdEmpleado());
        usuario.setEmpleado(mapearEntidad(empleadoDTO));
        usuarioRepository.save(usuario);
        return AuthResponse.builder()
                .token(jwtService.getToken(usuario,1))
                .build();
    }


    private Empleado mapearEntidad(EmpleadoDTO empleadoDTO){
        Empleado empleado=new Empleado();
        empleado.setId(empleadoDTO.getId());
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setCelular(empleadoDTO.getCelular());
        empleado.setEstado(empleadoDTO.getEstado());
        empleado.setDireccion(empleadoDTO.getDireccion());
        empleado.setCorreoElect(empleadoDTO.getCorreoElect());
        empleado.setNumDocumento(empleadoDTO.getNumDocumento());
        empleado.setTelFijo(empleadoDTO.getTelFijo());
        empleado.setFechaRegistro(empleadoDTO.getFechaRegistro());
        empleado.setUserRegistro(empleadoDTO.getUserRegistro());
        empleado.setUserActualizacion(empleadoDTO.getUserActualizacion());
        empleado.setUserActualizacion(empleadoDTO.getUserActualizacion());


        return empleado;
    }
}
