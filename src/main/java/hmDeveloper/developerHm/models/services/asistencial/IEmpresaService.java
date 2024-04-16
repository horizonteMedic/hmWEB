package hmDeveloper.developerHm.models.services.asistencial;

import hmDeveloper.developerHm.models.dtos.asistencial.EmpresaDTO;

import java.util.List;

public interface IEmpresaService {
    EmpresaDTO crearEmpresa(EmpresaDTO empresaDTO);
    List<EmpresaDTO> listadoEmpresas();
    EmpresaDTO obtenerEmpresaPorRuc(String ruc);
    EmpresaDTO actualizarEmpresa(EmpresaDTO empresaDTO, String ruc);
    void eliminarEmpresa(String ruc);
}
