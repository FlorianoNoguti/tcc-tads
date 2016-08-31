package br.com.tads.modelo;

import java.io.Serializable;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Cidade
 *
 */
@Entity
@Table(name="cidade")

public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_cidade")
	private Long id ;
	
	@Column(name="nome_cidade",nullable=false)
	@NotNull(message="Nome de cidade não pode ser vazio")
	private String nome;
	
	@JoinColumn(name = "id_estado")
	@ManyToOne
	private Estado estado;
	
	

	public Cidade() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}   
	
	
   
}
