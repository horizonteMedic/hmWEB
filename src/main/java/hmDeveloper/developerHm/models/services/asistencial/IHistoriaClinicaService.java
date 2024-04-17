package hmDeveloper.developerHm.models.services.asistencial;

import hmDeveloper.developerHm.models.dtos.asistencial.HistoriaClinicaDTO;

import java.util.List;

public interface IHistoriaClinicaService {
    HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO);
    List<HistoriaClinicaDTO> listadoHistoriasClinicas();
    HistoriaClinicaDTO obtenerHistoriaClinicaPorNOrden(String nOrden);
    HistoriaClinicaDTO actualizarHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO, String nOrden);
    void eliminarHistoriaClinica(String nOrden);
}
