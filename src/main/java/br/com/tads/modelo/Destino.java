package br.com.tads.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Destino
 *
 */
@Entity
@Table(name = "destino")
public class Destino implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_destino")
	private Long id;
	
	
	@NotEmpty
	@Column(name="descricao",nullable=false, length=100)
	private String descricao;
	
	@NotNull
	private Cidade cidade;
	
	@NotNull
	@Column(name="longitude_destino",nullable=false)
	private Double longitude;
	
	@NotNull
	@Column(name="latitude_destino",nullable=false)
	private Double latitude;

	public Destino() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	
   
}
