package moduloCronograma.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import moduloCronograma.model.CronogramaFatura;
import moduloCronograma.service.dto.CronogramaFaturaDTO;

@Mapper(componentModel = "spring")
public interface CronogramaFaturaMapper extends EntityMapper<CronogramaFaturaDTO, CronogramaFatura> {

	@Mappings({ @Mapping(source = "codLocalidade", target = "localidadeCiclo.codLocalidade"),
			@Mapping(source = "ciclo", target = "localidadeCiclo.ciclo") })
	CronogramaFatura toEntity(CronogramaFaturaDTO cronogramaFaturaDTO);

	@Mappings({ @Mapping(source = "localidadeCiclo.codLocalidade", target = "codLocalidade"),
			@Mapping(source = "localidadeCiclo.ciclo", target = "ciclo") })
	CronogramaFaturaDTO toDto(CronogramaFatura cronogramaFatura);
}
