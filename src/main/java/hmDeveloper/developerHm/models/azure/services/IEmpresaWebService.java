package hmDeveloper.developerHm.models.azure.services;

import hmDeveloper.developerHm.models.azure.dtos.*;

import java.util.List;

public interface IEmpresaWebService {

    List<HistorialUsuarioDTO> listadoHistoriaUsuario();
    List<DetalleHistoriaClinicaDTO> listaDetalleHistoriaClinica(long id);
    List<HistorialPacienteDTO> listadoHistorialPaciente(long id);

    List<ListadoEmpresaContrataDTO> listadoEmpresasContratas();
    EmpresaWebDTO crearEmpresaWeb(EmpresaWebDTO empresaWebDTO);

    List<EmpresaWebDTO> listadoEmpresasWeb();
    EmpresaWebDTO obtenerEmpresaWebPorID(long id);
    EmpresaWebDTO actualizarEmpresaWeb(EmpresaWebDTO empresaWebDTO, long id);
    void eliminarEmpresaWeb(long id);
}
