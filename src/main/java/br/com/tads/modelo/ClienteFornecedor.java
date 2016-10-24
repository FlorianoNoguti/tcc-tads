package br.com.tads.modelo;

import br.com.tads.modelo.Pessoa;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="cliente_fornecedor")
@PrimaryKeyJoinColumn(name= "id_pessoa")

public class ClienteFornecedor extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nomeResponsavel;
	
	private String cpfResponsavel;
	
	private String rgResponsavel;
	
	
	@Column(length=14)
	private String cpfCnpj;
	
	private String rgInscrtadual;
	
	@Column(length=5)
	private String orgaoEmissorRg;
	
		
	@Column(nullable=false)
	@NotNull(message="Campo nome deve ser preenchido")
	private String nomeRazaoSocial;
	
	@Temporal(value=TemporalType.DATE)
	private Date dtNascimento;
	
	
	

	public ClienteFornecedor() {
		super();
	}




	public String getNomeResponsavel() {
		return nomeResponsavel;
	}




	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}




	public String getCpfResponsavel() {
		return cpfResponsavel;
	}




	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}




	public String getRgResponsavel() {
		return rgResponsavel;
	}




	public void setRgResponsavel(String rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
	}

	



	public String getCpfCnpj() {
		return cpfCnpj;
	}




	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}


	public String getRgInscrtadual() {
		return rgInscrtadual;
	}




	public void setRgInscrtadual(String rgInscrtadual) {
		this.rgInscrtadual = rgInscrtadual;
	}




	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}




	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}




	public String getOrgaoEmissorRg() {
		return orgaoEmissorRg;
	}




	public void setOrgaoEmissorRg(String orgaoEmissorRg) {
		this.orgaoEmissorRg = orgaoEmissorRg;
	}




	public Date getDtNascimento() {
		return dtNascimento;
	}




	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}




	
	
	



	
}
