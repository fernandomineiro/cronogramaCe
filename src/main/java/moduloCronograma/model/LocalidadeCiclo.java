package moduloCronograma.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LocalidadeCiclo implements Serializable {


	private static final long serialVersionUID = 1L;

	@Column(name = "CD_CIDADE")
	private Short codLocalidade;

	@Column(name = "CICLO")
	private Short ciclo;

	private Integer refCronograma;
	
	public LocalidadeCiclo() {
	}

	public LocalidadeCiclo(Short codLocalidade, Short ciclo) {
		this.codLocalidade = codLocalidade;
		this.ciclo = ciclo;
	}

	public Short getCodLocalidade() {
		return codLocalidade;
	}

	public void setCodLocalidade(Short codLocalidade) {
		this.codLocalidade = codLocalidade;
	}

	public Short getCiclo() {
		return ciclo;
	}

	public void setCiclo(Short ciclo) {
		this.ciclo = ciclo;
	}

	public Integer getRefCronograma() {
		return refCronograma;
	}

	public void setRefCronograma(Integer refCronograma) {
		this.refCronograma = refCronograma;
	}
	
}
