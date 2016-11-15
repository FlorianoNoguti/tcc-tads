package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: ContasReceber
 *
 */
@Entity
@Table(name="contas_receber")

public class ContasReceber implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_contas_receber")
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name="dt_vcto",nullable=false)
	private Date dataVencimento;
	
	@NotNull
	@Column(name="dt_recebimento", nullable=false)
	private LocalDateTime dataRecebimento;
	
	@NotEmpty
	@Column(name="descricao_contas_receber",nullable=false)
	private String descricao;
	
	@NotNull
	@Column(name="valor_parcela",nullable=false)
	private Double valorParcela;
	
	@Column(name="juros")
	private Double juros;
	
	@Column(name="desconto")
	private Double desconto;
	
	@Column(name="valor_recebido")
	private Double valorRecebido;
	
	@NotNull
	@Column(name="nr_parcela",nullable=false)
	private Integer nrParcela;
	

	public ContasReceber() {
		super();
	}


	

	public Date getDataVencimento() {
		return dataVencimento;
	}




	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}




	public LocalDateTime getDataRecebimento() {
		return dataRecebimento;
	}


	public void setDataRecebimento(LocalDateTime dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getValorParcela() {
		return valorParcela;
	}


	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}


	public Double getJuros() {
		return juros;
	}


	public void setJuros(Double juros) {
		this.juros = juros;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getValorRecebido() {
		return valorRecebido;
	}


	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}


	public Integer getNrParcela() {
		return nrParcela;
	}


	public void setNrParcela(Integer nrParcela) {
		this.nrParcela = nrParcela;
	}


	public Long getId() {
		return id;
	}
	
	
   
}
