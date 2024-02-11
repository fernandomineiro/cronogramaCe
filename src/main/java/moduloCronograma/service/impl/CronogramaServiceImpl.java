package moduloCronograma.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moduloCronograma.repository.CronogramaFaturaRepository;
import moduloCronograma.service.CronogramaFaturaService;
import moduloCronograma.service.dto.CronogramaFaturaDTO;
import moduloCronograma.service.mapper.CronogramaFaturaMapper;

@Service
@Transactional
public class CronogramaServiceImpl implements CronogramaFaturaService{

	@Autowired
	private CronogramaFaturaRepository cronogramaFaturaRepository;
	@Autowired
	private CronogramaFaturaMapper cronogramaFaturaMapper;
	
	@Override
	public List<CronogramaFaturaDTO> buscar(List<Short> listCodLocalidade) {
		return cronogramaFaturaMapper.toDto(cronogramaFaturaRepository.findByLocalidadeCiclo_CodLocalidadeIn(listCodLocalidade));
	}

}
