package hmDeveloper.developerHm.models.services.combobox;

import hmDeveloper.developerHm.models.dtos.combobox.DistritoDTO;
import hmDeveloper.developerHm.models.entity.combobox.Distrito;
import hmDeveloper.developerHm.models.errors.ResourceNotFoundException;
import hmDeveloper.developerHm.models.repository.combobox.IDistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistritoServiceImpl implements IDistritoService {

    @Autowired
    IDistritoRepository distritoRepository;

    @Override
    public DistritoDTO crearDistrito(DistritoDTO distritoDTO) {
        Distrito distrito=mapearEntidad(distritoDTO);

        Distrito nuevoDistrito=distritoRepository.save(distrito);
        DistritoDTO distritoRespuesta=mapearDTO(nuevoDistrito);

        return distritoRespuesta;
    }

    @Override
    public List<DistritoDTO> listadoDistritoPorProvincia(String idProvincia) {
        List<Distrito> listadoDistritos=distritoRepository.listadoDistritoPorProvincia(idProvincia)
                .orElseThrow(()-> new ResourceNotFoundException("Distrito","id Provincia",Long.parseLong(idProvincia)));
        return listadoDistritos.stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public List<DistritoDTO> listadoDistritos() {
        List<Distrito> listadoDistritos=distritoRepository.findAll();
        return listadoDistritos.stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public DistritoDTO obtenerDistritoPorID(String id) {
        Distrito distrito=distritoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Distrito","id",Long.parseLong(id)));
        return mapearDTO(distrito);
    }

    @Override
    public DistritoDTO actualizarDistrito(DistritoDTO distritoDTO, String id) {
        Distrito distrito=distritoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Distrito","id",Long.parseLong(id)));
        Distrito distritoActual=
                distritoRepository.save(actualizarDistritoEntidad(distritoDTO,distrito));

        return mapearDTO(distritoActual);
    }

    @Override
    public void eliminarDistrito(String id) {
        Distrito distrito=distritoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Distrito","id",Long.parseLong(id)));

        distritoRepository.delete(distrito);
    }

    private DistritoDTO mapearDTO(Distrito distrito){
        DistritoDTO distritoDTO=new DistritoDTO();

        distritoDTO.setId(distrito.getId());
        distritoDTO.setNombre(distrito.getNombre());
        distritoDTO.setIdDepartamento(distrito.getIdDepartamento());
        distritoDTO.setIdProvincia(distrito.getIdProvincia());

        return distritoDTO;
    }

    private Distrito mapearEntidad(DistritoDTO distritoDTO){
        Distrito distrito=new Distrito();

        distrito.setId(distritoDTO.getId());
        distrito.setNombre(distritoDTO.getNombre());
        distrito.setIdDepartamento(distritoDTO.getIdDepartamento());
        distrito.setIdProvincia(distritoDTO.getIdProvincia());

        return distrito;
    }

    private Distrito actualizarDistritoEntidad(DistritoDTO distritoDTO,Distrito distrito){

        distrito.setNombre(distritoDTO.getNombre());
        distrito.setIdDepartamento(distritoDTO.getIdDepartamento());
        distrito.setIdProvincia(distritoDTO.getIdProvincia());

        return distrito;
    }


}
