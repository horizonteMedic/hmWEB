package hmDeveloper.developerHm.models.services.asistencial;

import hmDeveloper.developerHm.models.dtos.asistencial.DatosPacienteDTO;
import hmDeveloper.developerHm.models.dtos.asistencial.EmpresaDTO;
import hmDeveloper.developerHm.models.entity.asistencial.DatosPaciente;
import hmDeveloper.developerHm.models.entity.asistencial.Empresa;
import hmDeveloper.developerHm.models.repository.asistencial.IDatosPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosPacienteServiceImpl implements IDatosPacienteService{
    @Autowired
    private IDatosPacienteRepository datosPacienteRepository;

    @Override
    public DatosPacienteDTO crearDatosPaciente(DatosPacienteDTO datosPacienteDTO) {
        return null;
    }

    @Override
    public List<DatosPacienteDTO> listadoContratasDatosPacientes() {
        return null;
    }

    @Override
    public DatosPacienteDTO obtenerDatosPacientePorNumDoc(String numDoc) {
        return null;
    }

    @Override
    public DatosPacienteDTO actualizarDatosPaciente(DatosPacienteDTO datosPacienteDTO, String numDoc) {
        return null;
    }

    @Override
    public void eliminarDatosPaciente(String numDoc) {

    }

    private DatosPacienteDTO mapearDTO(DatosPaciente datosPaciente){
        DatosPacienteDTO datosPacienteDTO=new DatosPacienteDTO();

        datosPacienteDTO.setNumDoc(datosPaciente.getId());
        datosPacienteDTO.setTipoDoc(datosPaciente.getTipoDoc());
        datosPacienteDTO.setApellidos(datosPaciente.getApellidos());
        datosPacienteDTO.setNombres(datosPaciente.getNombres());
        datosPacienteDTO.setCelular(datosPaciente.getCelular());
        datosPacienteDTO.setEmail(datosPaciente.getEmail());
        datosPacienteDTO.setDirrecion(datosPaciente.getDirrecion());
        datosPacienteDTO.setSexo(datosPaciente.getSexo());
        datosPacienteDTO.setEstadoCivil(datosPaciente.getEstadoCivil());
        datosPacienteDTO.setNivelEstudio(datosPaciente.getNivelEstudio());
        datosPacienteDTO.setUbigeo(datosPaciente.getUbigeo());
        datosPacienteDTO.setOcupacion(datosPaciente.getOcupacion());
        datosPacienteDTO.setCaserio(datosPaciente.getCaserio());
        datosPacienteDTO.setLugarNac(datosPaciente.getLugarNac());
        datosPacienteDTO.setFechaNac(datosPaciente.getFechaNac());
        datosPacienteDTO.setEstado(datosPaciente.getEstado());
        datosPacienteDTO.setFechaRegistro(datosPaciente.getFechaRegistro());
        datosPacienteDTO.setUserRegistro(datosPaciente.getUserRegistro());

        return datosPacienteDTO;
    }

    private DatosPaciente mapearEntidad(DatosPacienteDTO datosPacienteDTO){
        DatosPaciente datosPaciente=new DatosPaciente();

        datosPaciente.setId(datosPacienteDTO.getNumDoc());
        datosPaciente.setTipoDoc(datosPacienteDTO.getTipoDoc());
        datosPaciente.setApellidos(datosPaciente.getApellidos());
        datosPaciente.setNombres(datosPacienteDTO.getNombres());
        datosPaciente.setDirrecion(datosPacienteDTO.getDirrecion());
        datosPaciente.setCelular(datosPacienteDTO.getCelular());
        datosPaciente.setEmail(datosPacienteDTO.getEmail());
        datosPaciente.setEstadoCivil(datosPacienteDTO.getEstadoCivil());
        datosPaciente.setUbigeo(datosPacienteDTO.getUbigeo());
        datosPaciente.setSexo(datosPacienteDTO.getSexo());
        datosPaciente.setNivelEstudio(datosPacienteDTO.getNivelEstudio());
        datosPaciente.setOcupacion(datosPacienteDTO.getOcupacion());
        datosPaciente.setCaserio(datosPacienteDTO.getCaserio());
        datosPaciente.setLugarNac(datosPacienteDTO.getLugarNac());
        datosPaciente.setFechaNac(datosPacienteDTO.getFechaNac());
        datosPaciente.setEstado(datosPacienteDTO.getEstado());
        datosPaciente.setFechaRegistro(datosPacienteDTO.getFechaRegistro());
        datosPaciente.setUserRegistro(datosPacienteDTO.getUserRegistro());

        return datosPaciente;
    }

    private DatosPaciente actualizarDatosPacienteEntidad(DatosPacienteDTO datosPacienteDTO,DatosPaciente datosPaciente){

        datosPaciente.setTipoDoc(datosPacienteDTO.getTipoDoc());
        datosPaciente.setApellidos(datosPaciente.getApellidos());
        datosPaciente.setNombres(datosPacienteDTO.getNombres());
        datosPaciente.setDirrecion(datosPacienteDTO.getDirrecion());
        datosPaciente.setCelular(datosPacienteDTO.getCelular());
        datosPaciente.setEmail(datosPacienteDTO.getEmail());
        datosPaciente.setEstadoCivil(datosPacienteDTO.getEstadoCivil());
        datosPaciente.setUbigeo(datosPacienteDTO.getUbigeo());
        datosPaciente.setSexo(datosPacienteDTO.getSexo());
        datosPaciente.setNivelEstudio(datosPacienteDTO.getNivelEstudio());
        datosPaciente.setOcupacion(datosPacienteDTO.getOcupacion());
        datosPaciente.setCaserio(datosPacienteDTO.getCaserio());
        datosPaciente.setLugarNac(datosPacienteDTO.getLugarNac());
        datosPaciente.setFechaNac(datosPacienteDTO.getFechaNac());
        datosPaciente.setEstado(datosPacienteDTO.getEstado());
        datosPaciente.setFechaRegistro(datosPacienteDTO.getFechaRegistro());
        datosPaciente.setUserRegistro(datosPacienteDTO.getUserRegistro());


        return datosPaciente;
    }

}
