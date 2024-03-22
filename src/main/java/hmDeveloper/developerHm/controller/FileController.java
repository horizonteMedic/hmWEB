package hmDeveloper.developerHm.controller;

import hmDeveloper.developerHm.models.dtos.ArchivoServidorDTO;
import hmDeveloper.developerHm.models.services.IArchivoServidorService;
import jakarta.validation.Valid;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v01/ct/archivos")
@CrossOrigin
public class FileController {

    @Autowired
    private IArchivoServidorService archivoServidorService;

    private static JSONObject json=null;


    @GetMapping("/detalleArchivo/{hc}/{ta}")
    public ResponseEntity<ArchivoServidorDTO> obtenerArchivoDetalle(@PathVariable Long hc, @PathVariable Long ta) {
        System.out.println("EL HC ES:"+hc);
        System.out.println("EL TA ES:"+ta);
        return ResponseEntity.ok(archivoServidorService.detalleArchivoServidor(hc,ta));
    }


    @GetMapping()
    public ResponseEntity<List<ArchivoServidorDTO>> obtenerListadoArchivoServidorDTO(){

        return ResponseEntity.ok(archivoServidorService.listadoArchivoServidor());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArchivoServidorDTO> obtenerArchivoServidorPorID(@PathVariable(name = "id") long id) {

        return ResponseEntity.ok(archivoServidorService.obtenerArchivoServidorPorID(id));
    }

    @PostMapping
    public ResponseEntity<ArchivoServidorDTO> guardarArchivoServidor(@Valid @RequestBody ArchivoServidorDTO archivoServidorDTO) {

        return new ResponseEntity<>(archivoServidorService.creararchivoServidor(archivoServidorDTO), HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<ArchivoServidorDTO> actualizarArchivoServidor(@Valid @RequestBody ArchivoServidorDTO archivoServidorDTO,
                                                          @PathVariable(name = "id") long id) {

        ArchivoServidorDTO archivoServidorDTOActualizado = archivoServidorService.actualizarArchivoServidor(archivoServidorDTO, id);
        return new ResponseEntity<>(archivoServidorDTOActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminararchivoServidor(@PathVariable(name = "id") long id) {
        archivoServidorService.eliminarArchivoServidor(id);
        json=new JSONObject();
        return new ResponseEntity<>(json.put("message","Registro Eliminado exitosamente!").toString(),HttpStatus.OK);
    }


}
