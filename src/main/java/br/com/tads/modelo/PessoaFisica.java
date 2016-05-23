package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
@Table(name="pessoa_fisica")
@PrimaryKeyJoinColumn(name="id_pessoa")
public class PessoaFisica extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, unique=true, length=11)
	@NotNull(message="Campo CPF deve ser preenchido")
	private String cpf;	
	
	@Column(nullable=false,unique=true)
	@NotNull(message="Campo RG deve ser preenchido")
	private String rg;
	
	@Column(nullable=false)
	@NotNull(message="Campo data de nascimento deve ser preenchido")
	private Date dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
   
	
}
