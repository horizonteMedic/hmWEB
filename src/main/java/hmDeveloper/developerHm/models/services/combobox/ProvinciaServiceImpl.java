package hmDeveloper.developerHm.models.services.combobox;

import hmDeveloper.developerHm.models.dtos.combobox.ProvinciaDTO;
import hmDeveloper.developerHm.models.entity.combobox.Provincia;
import hmDeveloper.developerHm.models.errors.ResourceNotFoundException;
import hmDeveloper.developerHm.models.repository.combobox.IProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

    @Autowired
    private IProvinciaRepository provinciaRepository;

    @Override
    public ProvinciaDTO crearProvincia(ProvinciaDTO provinciaDTO) {
        Provincia provincia=mapearEntidad(provinciaDTO);

        Provincia nuevoPronvincia=provinciaRepository.save(provincia);
        ProvinciaDTO provinciaRespuesta=mapearDTO(nuevoPronvincia);

        return provinciaRespuesta;
    }

    @Override
    public List<ProvinciaDTO> ListadoProvinciaPorDepartamento(String idDepartamento) {
        List<Provincia> listadoProvincias=provinciaRepository.listadoProvinciasPorDepartamento(idDepartamento)
                .orElseThrow(()-> new ResourceNotFoundException("Provincia","id",Long.parseLong(idDepartamento)));
        return listadoProvincias.stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public List<ProvinciaDTO> listadoProvincia() {
        List<Provincia> listadoProvincias=provinciaRepository.findAll();
        return listadoProvincias.stream().map(this::mapearDTO).collect(Collectors.toList());
    }

    @Override
    public ProvinciaDTO obtenerProvinciaPorID(String id) {
        Provincia provincia=provinciaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Provincia","id",Long.parseLong(id)));
        return mapearDTO(provincia);
    }

    @Override
    public ProvinciaDTO actualizarProvincia(ProvinciaDTO provinciaDTO, String id) {
        Provincia provincia=provinciaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Provincia","id",Long.parseLong(id)));
        Provincia provinciaActual=
                provinciaRepository.save(actualizarProvinciaEntidad(provinciaDTO,provincia));

        return mapearDTO(provinciaActual);
    }

    @Override
    public void eliminarProvincia(String id) {
        Provincia provincia=provinciaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Provincia","id",Long.parseLong(id)));

        provinciaRepository.delete(provincia);
    }

    private ProvinciaDTO mapearDTO(Provincia provincia){
        ProvinciaDTO provinciaDTO=new ProvinciaDTO();

        provinciaDTO.setId(provincia.getId());
        provinciaDTO.setNombre(provincia.getNombre());
        provinciaDTO.setIdDepartamento(provincia.getIdDepartamento());

        return provinciaDTO;
    }

    private Provincia mapearEntidad(ProvinciaDTO provinciaDTO){
        Provincia provincia=new Provincia();

        provincia.setId(provinciaDTO.getId());
        provincia.setNombre(provinciaDTO.getNombre());
        provincia.setIdDepartamento(provinciaDTO.getIdDepartamento());

        return provincia;
    }

    private Provincia actualizarProvinciaEntidad(ProvinciaDTO provinciaDTO,Provincia provincia){

        provincia.setNombre(provinciaDTO.getNombre());
        provincia.setIdDepartamento(provinciaDTO.getIdDepartamento());

        return provincia;
    }


}
