package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@Table(name="pessoa_juridica")
@PrimaryKeyJoinColumn(name="id_pessoa")
public class PessoaJuridica extends Pessoa implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false)
	@NotNull(message="Campo nome fantasia deve ser preenchido")
	private String nomeFantasia;
	
	@Column(nullable=false, unique=true)
	@NotNull(message="Campo CNPJ deve ser preenchido")
	private String cnpj;
	
	@Column(nullable=false,unique=true)
	@NotNull(message="Campo Inscrição Estadual deve ser preenchido")
	private String inscricaoEstadual;
	

	public PessoaJuridica() {
		super();
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}


	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
   
}
