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
                findById(id).orElseThrow(()->new ResourceNotFoundException("Empleado","id",id));

        return mapearDTO(empleado);
    }

    @Override
    public EmpleadoDTO actualizarEmpleado(EmpleadoDTO empleadoDTO, long id) {

        Empleado empleado=empleadoRepository.
                findById(id).orElseThrow(()-> new ResourceNotFoundException("Empleado","id",id));

        Empleado empleadoActualizacion=empleadoRepository.save(actualizarEmpleadoEntidad(empleadoDTO,empleado));

        return mapearDTO(empleadoActualizacion);
    }

    @Override
    public void eliminarEmpleado(long id) {
        Empleado empleado= empleadoRepository.
                findById(id).orElseThrow(()-> new ResourceNotFoundException("Empleado","id",id));
        empleadoRepository.delete(empleado);
    }

    //convierte entidad a DTO
    private EmpleadoDTO mapearDTO(Empleado empleado){
        EmpleadoDTO empleadoDTO=new EmpleadoDTO();

        empleadoDTO.setId(empleado.getId());
        empleadoDTO.setNombres(empleado.getNombres());
        empleadoDTO.setApellidos(empleado.getApellidos());
        empleadoDTO.setCargo(empleado.getCargo());
        empleadoDTO.setCelular(empleado.getCelular());
        empleadoDTO.setEstado(empleado.getEstado());
        empleadoDTO.setDireccion(empleado.getDireccion());
        empleadoDTO.setCorreoElect(empleado.getCorreoElect());
        empleadoDTO.setNumDocumento(empleado.getNumDocumento());
        empleadoDTO.setTelFijo(empleado.getTelFijo());
        empleadoDTO.setFechaRegistro(empleado.getFechaRegistro());
        empleadoDTO.setUserRegistro(empleado.getUserRegistro());
        empleadoDTO.setUserActualizacion(empleado.getUserActualizacion());
        empleadoDTO.setUserActualizacion(empleado.getUserActualizacion());

        return empleadoDTO;
    }

    //convierte DTO a Entidad
    private Empleado mapearEntidad(EmpleadoDTO empleadoDTO){
        Empleado empleado=new Empleado();

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

    private Empleado actualizarEmpleadoEntidad(EmpleadoDTO empleadoDTO,Empleado empleado){
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setCorreoElect(empleadoDTO.getCorreoElect());
        empleado.setCelular(empleadoDTO.getCelular());
        empleado.setTelFijo(empleadoDTO.getTelFijo());
        empleado.setDireccion(empleadoDTO.getDireccion());
        empleado.setNumDocumento(empleadoDTO.getNumDocumento());
        empleado.setEstado(empleadoDTO.getEstado());
        empleado.setFechaRegistro(empleadoDTO.getFechaRegistro());
        empleado.setUserRegistro(empleadoDTO.getUserRegistro());
        empleado.setFechaActualizacion(empleadoDTO.getFechaActualizacion());
        empleado.setUserActualizacion(empleadoDTO.getUserActualizacion());

        return empleado;
    }
}
