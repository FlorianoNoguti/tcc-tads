package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import br.com.tads.modelo.Pessoa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="id_pessoa")
public class Funcionario extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_registro")
	private Date dtRegistro = new Date();
	
	@NotEmpty
	@Column(name="funcao",nullable=false)
	private String funcao;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name="dt_admissao",nullable=false)
	private Date dataAdmissao;
	
	@NotEmpty
	@Column(name="cnh", nullable=false,unique=true)
	private String cnh;
	
	@NotEmpty
	@Column(name="categoria_cnh",nullable=false, length=2)
	private String categoriaCnh;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name="validade_cnh",nullable=false)	
	private Date validadeCnh;
	
	@NotEmpty
	@Column(name="carteira_saude",nullable=false)
	private String carteiraSaude;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name="validade_carteira_saude",nullable=false)
	private Date validadeCarteiraSaude;
	
	
	@Column(name="carteira_especial")
	private String cursoEspecial;
	
	public Funcionario(){
		super();
	}
	
	public Funcionario(String nomeRazaoSocial,String cpfCnpj,String rgInscrEstadual,String telefone){
		super(nomeRazaoSocial,cpfCnpj,rgInscrEstadual,telefone);
		
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCategoriaCnh() {
		return categoriaCnh;
	}

	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}

	public Date getValidadeCnh() {
		return validadeCnh;
	}

	public void setValidadeCnh(Date validadeCnh) {
		this.validadeCnh = validadeCnh;
	}

	public String getCarteiraSaude() {
		return carteiraSaude;
	}

	public void setCarteiraSaude(String carteiraSaude) {
		this.carteiraSaude = carteiraSaude;
	}

	public Date getValidadeCarteiraSaude() {
		return validadeCarteiraSaude;
	}

	public void setValidadeCarteiraSaude(Date validadeCarteiraSaude) {
		this.validadeCarteiraSaude = validadeCarteiraSaude;
	}

	public String getCursoEspecial() {
		return cursoEspecial;
	}

	public void setCursoEspecial(String cursoEspecial) {
		this.cursoEspecial = cursoEspecial;
	}
	
	
}
