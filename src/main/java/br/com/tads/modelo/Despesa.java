package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Despesa
 *
 */
@Entity
@Table(name="despesa")
public class Despesa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_despesa")
	private Long id;
	
	@NotNull
	@Column(name="dt_despesa",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataRegistro;
	
	@NotNull
	@Column(name="veiculo",nullable=false)
	private Veiculo veiculo;
	
	@NotNull
	@Column(name="tipoDespesa",nullable=false)
	private TipoDespesa tipoDespesa;
	
	@NotNull
	@Column(name="funcionario",nullable=false)
	private Funcionario funcionario;
	
	
	@Column(name="descricaoDespesa")
	private String descricao;
	
	@NotNull
	@Column(name="valorTotal", nullable=false)
	private Double valorTotal;
	

	

	public Despesa() {
		super();
	}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	} 
	
}
