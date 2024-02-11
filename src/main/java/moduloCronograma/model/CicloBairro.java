package moduloCronograma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import moduloCronograma.util.customAnnotation.JsonCesanNotSerializable;



@Entity
@Table(name = "CDTCC")
public class CicloBairro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonCesanNotSerializable
	@Column(name="ROWID")
	private Long id;
	@Column(name="CD_BAIRRO")
	private Short cdBairro;
	@Column(name="CD_CIDADE")
	private Short cdCidade;
	@Column(name="CICLO")
	private Short ciclo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Short getCdBairro() {
		return cdBairro;
	}
	public void setCdBairro(Short cdBairro) {
		this.cdBairro = cdBairro;
	}
	public Short getCdCidade() {
		return cdCidade;
	}
	public void setCdCidade(Short cdCidade) {
		this.cdCidade = cdCidade;
	}
	public Short getCiclo() {
		return ciclo;
	}
	public void setCiclo(Short ciclo) {
		this.ciclo = ciclo;
	}
	
	
	

}
