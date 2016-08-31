package br.com.tads.modelo;

import br.com.tads.modelo.Pessoa;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="cliente_fornecedor")
@PrimaryKeyJoinColumn(name= "id_pessoa")

public class ClienteFornecedor extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/*usuario seleciona tipo pessoa fisica ou juridica
	 true=juridica false=fisica* */
	private Boolean tipoPessoa;
	
	private String nomeResponsavel;
	
	private String cpfResponsavel;
	
	private String cnpj;
	
	private String inscricaoEstadual;
		
	private String nomeFantasia;
	
	private Date dataFundacao;
	
	

	public ClienteFornecedor() {
		super();
	}



	public Boolean getTipoPessoa() {
		return tipoPessoa;
	}



	public void setTipoPessoa(Boolean tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
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



	public String getNomeFantasia() {
		return nomeFantasia;
	}



	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}



	public Date getDataFundacao() {
		return dataFundacao;
	}



	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
   
}
