package hmDeveloper.developerHm.models.azure.services.asistencial;

import hmDeveloper.developerHm.models.azure.dtos.asistencial.DatosPacienteDTO;

import java.util.List;

public interface IDatosPacienteService {
    DatosPacienteDTO crearDatosPaciente(DatosPacienteDTO datosPacienteDTO);
    List<DatosPacienteDTO> listadoContratasDatosPacientes();
    DatosPacienteDTO obtenerDatosPacientePorNumDoc(String numDoc);
    DatosPacienteDTO actualizarDatosPaciente(DatosPacienteDTO datosPacienteDTO, String numDoc);
    void eliminarDatosPaciente(String numDoc);
}
