package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
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
	
	@NotEmpty
	@Column(name="funcao",nullable=false)
	private String funcao;
	
	@NotNull
	@Column(name="dt_admissao",nullable=false)
	private LocalDateTime dataAdmissao;
	
	@NotEmpty
	@Column(name="cnh", nullable=false,unique=true)
	private String cnh;
	
	@NotEmpty
	@Column(name="categoria_cnh",nullable=false, length=2)
	private String categoriaCnh;
	
	@NotNull
	@Column(name="validade_cnh",nullable=false)	
	private LocalDateTime validadeCnh;
	
	@NotEmpty
	@Column(name="carteira_saude",nullable=false)
	private String carteiraSaude;
	
	@NotNull
	@Column(name="validade_carteira_saude",nullable=false)
	private LocalDateTime validadeCarteiraSaude;
	
	@NotEmpty
	@Column(name="carteira_especial",nullable=false)
	private String cursoEspecial;

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public LocalDateTime getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDateTime dataAdmissao) {
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

	public LocalDateTime getValidadeCnh() {
		return validadeCnh;
	}

	public void setValidadeCnh(LocalDateTime validadeCnh) {
		this.validadeCnh = validadeCnh;
	}

	public String getCarteiraSaude() {
		return carteiraSaude;
	}

	public void setCarteiraSaude(String carteiraSaude) {
		this.carteiraSaude = carteiraSaude;
	}

	public LocalDateTime getValidadeCarteiraSaude() {
		return validadeCarteiraSaude;
	}

	public void setValidadeCarteiraSaude(LocalDateTime validadeCarteiraSaude) {
		this.validadeCarteiraSaude = validadeCarteiraSaude;
	}

	public String getCursoEspecial() {
		return cursoEspecial;
	}

	public void setCursoEspecial(String cursoEspecial) {
		this.cursoEspecial = cursoEspecial;
	}
	
	
}
