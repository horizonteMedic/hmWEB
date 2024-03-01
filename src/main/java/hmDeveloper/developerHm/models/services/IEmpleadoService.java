package hmDeveloper.developerHm.models.services;

import hmDeveloper.developerHm.models.dtos.EmpleadoDTO;

import java.util.List;

public interface IEmpleadoService {
    EmpleadoDTO crearEmpleado(EmpleadoDTO empleadoDTO);

    List<EmpleadoDTO> listadoEmpleados();
    EmpleadoDTO obtenerEmpleadoPorID(long id);
    EmpleadoDTO actualizarEmpleado(EmpleadoDTO empleadoDTO, long id);
    void eliminarEmpleado(long id);
}
