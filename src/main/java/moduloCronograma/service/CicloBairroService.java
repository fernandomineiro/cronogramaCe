package moduloCronograma.service;

import java.util.List;

import moduloCronograma.service.dto.MensagemTipoGenericoDTO;

public interface CicloBairroService {

	public MensagemTipoGenericoDTO<List<Short>> buscarCiclos(Short cdBairro, Short cdCidade);
	
	public MensagemTipoGenericoDTO<List<Short>> buscarCiclos(Short cdCidade);
}
