package hmDeveloper.developerHm.controller.asistencial;

import hmDeveloper.developerHm.models.dtos.asistencial.HistoriaClinicaDTO;
import hmDeveloper.developerHm.models.services.asistencial.IHistoriaClinicaService;
import jakarta.validation.Valid;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v01/ct/historiaClinica")
@CrossOrigin
public class HistoriaClinicaController {

    @Autowired
    private IHistoriaClinicaService historiaClinicaService;

    private static JSONObject json=null;

    @GetMapping()
    public ResponseEntity<List<HistoriaClinicaDTO>> obtenerListadoHistoriaClinica(){
        return  ResponseEntity.ok(historiaClinicaService.listadoHistoriasClinicas());
    }

    @GetMapping("/{nroOrden}")
    public ResponseEntity<HistoriaClinicaDTO> obtenerHistoriaClinicaPorNroOrden(@PathVariable(name = "nroOrden") String nroOrden) {

        return ResponseEntity.ok(historiaClinicaService.obtenerHistoriaClinicaPorNOrden(nroOrden));
    }


    @PostMapping
    public ResponseEntity<HistoriaClinicaDTO> guardarHistoriaClinica(@Valid @RequestBody HistoriaClinicaDTO historiaClinicaDTO) {

        return new ResponseEntity<>(historiaClinicaService.crearHistoriaClinica(historiaClinicaDTO), HttpStatus.CREATED);

    }

    @PutMapping("/{nroOrden}")
    public ResponseEntity<HistoriaClinicaDTO> actualizarHistoriaClinica(@Valid @RequestBody HistoriaClinicaDTO historiaClinicaDTO,
                                                        @PathVariable(name = "nroOrden") String nroOrden) {

        HistoriaClinicaDTO historiaClinicaDTOActualizada = historiaClinicaService.actualizarHistoriaClinica(historiaClinicaDTO, nroOrden);
        return new ResponseEntity<>(historiaClinicaDTOActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{nroOrden}")
    public ResponseEntity<String> eliminarHistoriaClinica(@PathVariable(name = "nroOrden") String nroOrden) {
        historiaClinicaService.eliminarHistoriaClinica(nroOrden);
        json=new JSONObject();
        return new ResponseEntity<>(json.put("message","Registro Eliminado exitosamente!").toString(),HttpStatus.OK);
    }


}
