package br.com.tads.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: TipoDespesa
 *
 */
@Entity
@Table(name="tipoDespesa")

public class TipoDespesa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idTipoDespesa")
	private Long id;

	@NotEmpty
	@Column(name="descricao_tipo_despesa", nullable = false)
	private String descricao;
	
	public TipoDespesa() {
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
	
	
   
}
