package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.EmpleadoDTO;
import hmDeveloper.developerHm.models.entity.Empleado;
import hmDeveloper.developerHm.models.errors.ResourceNotFoundException;
import hmDeveloper.developerHm.models.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private IEmpleadoRepository empleadoRepository;


    @Override
    public EmpleadoDTO crearEmpleado(EmpleadoDTO empleadoDTO) {

        Empleado empleado=mapearEntidad(empleadoDTO);

        Empleado nuevoEmpleado= empleadoRepository.save(empleado);

        EmpleadoDTO empleadoRespuesta=mapearDTO(nuevoEmpleado);

        return empleadoRespuesta;
    }

    @Override
    public List<EmpleadoDTO> listadoEmpleados() {

        List<Empleado> listadoEmpleado= empleadoRepository.findAll();

        return listadoEmpleado.stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public EmpleadoDTO obtenerEmpleadoPorID(long id) {

        Empleado empleado=empleadoRepository.
                findById(id).orElseThrow(()->new ResourceNotFoundException("Empleado","num doc",id));

        return mapearDTO(empleado);
    }

    @Override
    public EmpleadoDTO actualizarEmpleado(EmpleadoDTO empleadoDTO, long id) {

        Empleado empleado=empleadoRepository.
                findById(id).orElseThrow(()-> new ResourceNotFoundException("Empleado","num doc",id));

        Empleado empleadoActualizacion=empleadoRepository.save(actualizarEmpleadoEntidad(empleadoDTO,empleado));

        return mapearDTO(empleadoActualizacion);
    }

    @Override
    public void eliminarEmpleado(long id) {
        Empleado empleado= empleadoRepository.
                findById(id).orElseThrow(()-> new ResourceNotFoundException("Empleado","num doc",id));
        empleadoRepository.delete(empleado);
    }

    //convierte entidad a DTO
    private EmpleadoDTO mapearDTO(Empleado empleado){
        EmpleadoDTO empleadoDTO=new EmpleadoDTO();

        empleadoDTO.setId_empleado(empleado.getId());
        empleadoDTO.setNumDocumento(empleado.getNumDocumento());
        empleadoDTO.setTipoDoc(empleado.getTipoDoc());
        empleadoDTO.setNombres(empleado.getNombres());
        empleadoDTO.setApellidos(empleado.getApellidos());
        empleadoDTO.setCargo(empleado.getCargo());
        empleadoDTO.setUbigeo(empleado.getUbigeo());
        empleadoDTO.setCip(empleado.getCip());
        empleadoDTO.setCorreoElect(empleado.getCorreoElect());
        empleadoDTO.setCelular(empleado.getCelular());
        empleadoDTO.setTelFijo(empleado.getTelFijo());
        empleadoDTO.setDireccion(empleado.getDireccion());
        empleadoDTO.setEstado(empleado.getEstado());
        empleadoDTO.setFechaNacimiento(empleado.getFechaNacimiento());
        empleadoDTO.setFechaRegistro(empleado.getFechaRegistro());
        empleadoDTO.setUserRegistro(empleado.getUserRegistro());
        empleadoDTO.setFechaActualizacion(empleado.getFechaActualizacion());
        empleadoDTO.setUserActualizacion(empleado.getUserActualizacion());

        return empleadoDTO;
    }

    //convierte DTO a Entidad
    private Empleado mapearEntidad(EmpleadoDTO empleadoDTO){
        Empleado empleado=new Empleado();

        empleado.setNumDocumento(empleadoDTO.getNumDocumento());
        empleado.setTipoDoc(empleadoDTO.getTipoDoc());
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setUbigeo(empleadoDTO.getUbigeo());
        empleado.setCip(empleadoDTO.getCip());
        empleado.setCorreoElect(empleadoDTO.getCorreoElect());
        empleado.setCelular(empleadoDTO.getCelular());
        empleado.setTelFijo(empleadoDTO.getTelFijo());
        empleado.setDireccion(empleadoDTO.getDireccion());
        empleado.setEstado(empleadoDTO.getEstado());
        empleado.setFechaNacimiento(empleadoDTO.getFechaNacimiento());
        empleado.setFechaRegistro(empleadoDTO.getFechaRegistro());
        empleado.setUserRegistro(empleadoDTO.getUserRegistro());
        empleado.setFechaActualizacion(empleadoDTO.getFechaActualizacion());
        empleado.setUserActualizacion(empleadoDTO.getUserActualizacion());

        return empleado;
    }

    private Empleado actualizarEmpleadoEntidad(EmpleadoDTO empleadoDTO,Empleado empleado){

        empleado.setNumDocumento(empleadoDTO.getNumDocumento());
        empleado.setTipoDoc(empleadoDTO.getTipoDoc());
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setUbigeo(empleadoDTO.getUbigeo());
        empleado.setCip(empleadoDTO.getCip());
        empleado.setCorreoElect(empleadoDTO.getCorreoElect());
        empleado.setCelular(empleadoDTO.getCelular());
        empleado.setTelFijo(empleadoDTO.getTelFijo());
        empleado.setDireccion(empleadoDTO.getDireccion());
        empleado.setEstado(empleadoDTO.getEstado());
        empleado.setFechaNacimiento(empleadoDTO.getFechaNacimiento());
        empleado.setFechaRegistro(empleadoDTO.getFechaRegistro());
        empleado.setUserRegistro(empleadoDTO.getUserRegistro());
        empleado.setFechaActualizacion(empleadoDTO.getFechaActualizacion());
        empleado.setUserActualizacion(empleadoDTO.getUserActualizacion());

        return empleado;
    }
}
