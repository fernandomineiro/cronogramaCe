package moduloCronograma.service;

import java.util.List;

import moduloCronograma.service.dto.CronogramaFaturaDTO;

public interface CronogramaFaturaService {

	public List<CronogramaFaturaDTO> buscar(List<Short> listCodLocalidade);
}
