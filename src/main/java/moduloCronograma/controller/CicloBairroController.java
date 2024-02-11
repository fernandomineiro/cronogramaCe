package moduloCronograma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moduloCronograma.service.CicloBairroService;
import moduloCronograma.service.dto.MensagemTipoGenericoDTO;

@RestController
@RequestMapping("/backend-cronograma/cicloBairro")
public class CicloBairroController {

	@Autowired
	private CicloBairroService cicloBairroService;
	
	@CrossOrigin
	@GetMapping("/bairro/{idBairro}/localidade/{idCidade}")
	public MensagemTipoGenericoDTO<List<Short>> buscarCiclo(@PathVariable(value = "idBairro") Short idBairro,@PathVariable(value = "idCidade") Short idCidade) {
		return cicloBairroService.buscarCiclos(idBairro, idCidade);
	}
	
	@CrossOrigin
	@GetMapping("/localidade/{idCidade}")
	public MensagemTipoGenericoDTO<List<Short>> buscarCiclo(@PathVariable(value = "idCidade") Short idCidade) {
		return cicloBairroService.buscarCiclos(idCidade);
	}
}
