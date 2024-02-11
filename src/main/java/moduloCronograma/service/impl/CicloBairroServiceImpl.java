package moduloCronograma.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moduloCronograma.repository.CicloBairroRepository;
import moduloCronograma.service.CicloBairroService;
import moduloCronograma.service.dto.MensagemTipoGenericoDTO;

@Service
public class CicloBairroServiceImpl implements CicloBairroService {

	@Autowired
	private CicloBairroRepository cicloBairroRepository;

	@Override
	public MensagemTipoGenericoDTO<List<Short>> buscarCiclos(Short cdBairro, Short cdCidade) {
		MensagemTipoGenericoDTO<List<Short>> mensagem = new MensagemTipoGenericoDTO<List<Short>>();
		mensagem.setMensagem(cicloBairroRepository.findByCdBairroAndCdCidade(cdBairro, cdCidade).stream()
				.map(e -> e.getCiclo()).sorted().collect(Collectors.toList()));
		return mensagem;
	}

	@Override
	public MensagemTipoGenericoDTO<List<Short>> buscarCiclos(Short cdCidade) {
		MensagemTipoGenericoDTO<List<Short>> mensagem = new MensagemTipoGenericoDTO<List<Short>>();
		mensagem.setMensagem(cicloBairroRepository.findByCdCidade( cdCidade).stream()
				.map(e -> e.getCiclo()).distinct().sorted().collect(Collectors.toList()));
		return mensagem;
	}

}
