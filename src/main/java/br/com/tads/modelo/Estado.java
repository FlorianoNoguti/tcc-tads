package br.com.tads.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Estado
 *
 */
@Entity
@Table(name="estado")

public class Estado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_estado")
	private Long id;
	
	@Column(name="nome_estado", nullable=false ,unique=true)
	@NotNull(message="Nome de estado não pode ser vazio")
	private String nome;
	
	
	@Column(name="sigla",length=2)
	@NotNull(message="Sigla não pode ser vazia")
	private String sigla;
	

	public Estado() {
		super();
	}   
	
	public String getNome() {
		return nome;
	}
	public Long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	

	
   
}
