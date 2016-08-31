package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;
import br.com.tads.modelo.Pessoa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="id_pessoa")
public class Funcionario extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String funcao;
	
	private Date dataAdmissao;
	
	@Column(nullable=false,unique=true)
	@NotNull(message="Campo de cnh deve ser preenchido")
	private String cnh;
	
	@Column(nullable=false, length=2)
	@NotNull(message="Campo de categoria de cnh deve ser preenchido")
	private String categoriaCnh;
	
	@Column(nullable=false)
	@NotNull(message="Campo de validade de cnh deve ser preenchido")
	private Date validadeCnh;
	
	
	private String carteiraSaude;
	
	private Date validadeCarteiraSaude;
	
	private String cursoEspecial;
	
	private Date validadeCursoEspecial;
	
	private Double salario;

	public Funcionario() {
		super();
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

	public Date getValidadeCursoEspecial() {
		return validadeCursoEspecial;
	}

	public void setValidadeCursoEspecial(Date validadeCursoEspecial) {
		this.validadeCursoEspecial = validadeCursoEspecial;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
   
}
