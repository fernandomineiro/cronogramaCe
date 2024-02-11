package moduloCronograma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import moduloCronograma.service.CronogramaFaturaService;
import moduloCronograma.service.dto.CronogramaFaturaDTO;

@RestController
@RequestMapping("/backend-cronograma/cronograma")
public class CronogramaFaturaController {

	@Autowired
	private CronogramaFaturaService cronogramaFaturaService;
	
	@CrossOrigin
	@GetMapping("/localidade")
	public List<CronogramaFaturaDTO> buscarPorMatricula(@RequestParam List<Short> listCodLocalidade) {
		return cronogramaFaturaService.buscar(listCodLocalidade);
	}
}
