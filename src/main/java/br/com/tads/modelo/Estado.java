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
	
	
	@Column(name="sigla_estado",length=2)
	@NotNull(message="Sigla não pode ser vazia")
	private String sigla_estado;
	

	public Estado() {
		super();
	}   
	public Id getId_estado() {
		return this.getId_estado();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla_estado() {
		return sigla_estado;
	}
	public void setSigla_estado(String sigla_estado) {
		this.sigla_estado = sigla_estado;
	}
	

	
   
}
