package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ContasPagar
 *
 */
@Entity
@Table(name="contas_pagar")

public class ContasPagar implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_contas_pagar")
	private long id;
	
	@Column(name="vr_total")
	private Double valorTotal;
	
	@Column(name="nr_parcela")
	private Integer nrParcela;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_vcto")
	private Date dtVencimento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_pgto")
	private Date dtPagamento;
	
	@Column(name="valor_parcela")
	private Double valorParcela;
	
	@Column(name="valor_pago")
	private Double valorPago;

	public ContasPagar() {
		super();
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getNrParcela() {
		return nrParcela;
	}

	public void setNrParcela(Integer nrParcela) {
		this.nrParcela = nrParcela;
	}

	

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Date getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public long getId() {
		return id;
	}
	
   
}
