package moduloCronograma.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import moduloCronograma.util.customAnnotation.JsonCesanNotSerializable;


@Entity
@Table(name = "FTTCR")
public class CronogramaFatura {

	@EmbeddedId
	@JsonCesanNotSerializable
	private LocalidadeCiclo localidadeCiclo;
	@Column(name = "FASE")
	private Short fase;
	public LocalidadeCiclo getLocalidadeCiclo() {
		return localidadeCiclo;
	}
	public void setLocalidadeCiclo(LocalidadeCiclo localidadeCiclo) {
		this.localidadeCiclo = localidadeCiclo;
	}
	public Short getFase() {
		return fase;
	}
	public void setFase(Short fase) {
		this.fase = fase;
	}
	
	
}
