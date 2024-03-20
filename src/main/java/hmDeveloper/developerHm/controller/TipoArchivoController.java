package hmDeveloper.developerHm.controller;

import hmDeveloper.developerHm.models.dtos.RolDTO;
import hmDeveloper.developerHm.models.dtos.TipoArchivoDTO;
import hmDeveloper.developerHm.models.services.ITipoArchivoService;
import jakarta.validation.Valid;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v01/ct/tipoArchivo")
@CrossOrigin
public class TipoArchivoController {

    @Autowired
    private ITipoArchivoService tipoArchivoService;

    private static JSONObject json=null;


    @GetMapping()
    public ResponseEntity<List<TipoArchivoDTO>> obtenerListadoTipoArchivo(){
        return  ResponseEntity.ok(tipoArchivoService.listadoTipoArchivo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoArchivoDTO> obtenerTipoArchivoPorID(@PathVariable(name = "id") long id) {

        return ResponseEntity.ok(tipoArchivoService.obtenerTipoArchivoPorID(id));
    }


    @PostMapping
    public ResponseEntity<TipoArchivoDTO> guardarTipoArchivo(@Valid @RequestBody TipoArchivoDTO tipoArchivoDTO) {

        return new ResponseEntity<>(tipoArchivoService.crearTipoArchivo(tipoArchivoDTO), HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoArchivoDTO> actualizarTipoArchivo(@Valid @RequestBody TipoArchivoDTO tipoArchivoDTO,
                                                @PathVariable(name = "id") long id) {

        TipoArchivoDTO tipoArchivoDTOActualizado = tipoArchivoService.actualizarTipoArchivo(tipoArchivoDTO, id);
        return new ResponseEntity<>(tipoArchivoDTOActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTipoArchivo(@PathVariable(name = "id") long id) {
        tipoArchivoService.eliminarTipoArchivo(id);
        json=new JSONObject();
        return new ResponseEntity<>(json.put("message","Registro Eliminado exitosamente!").toString(),HttpStatus.OK);
    }


}
