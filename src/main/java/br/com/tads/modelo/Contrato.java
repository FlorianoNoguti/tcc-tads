package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contrato
 *
 */
@Entity
@Table(name = "contrato")
public class Contrato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_contrato")
	private Long id;

	private TipoContrato tipoContrato;
	
	@Column(name="dataInicioContrato", nullable = false)
	private LocalDate dataInicioContrato;
	
	@Column(name="dataTerminoContrato", nullable = false)
	private LocalDate dataTerminoContrato;
	
	@JoinColumn(name = "id_passageiro")
	@ManyToOne
	private Pessoa passageiro;
	
	@JoinColumn(name = "id_responsavel")
	@ManyToOne
	private Pessoa responsavel;
	
	@Column(name = "destino",nullable=false)
	private Destino destino;
	
	@Column(name = "funcionario", nullable=false)
	private Funcionario funcionario;
	
	@Column(name="veiculo", nullable = false)
	private Veiculo veiculo;
	
	@Column(name="valorTotal", nullable=false)
	private Double valorTotal;
	
	
	public Contrato() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}


	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}


	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}


	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}


	public LocalDate getDataTerminoContrato() {
		return dataTerminoContrato;
	}


	public void setDataTerminoContrato(LocalDate dataTerminoContrato) {
		this.dataTerminoContrato = dataTerminoContrato;
	}


	public Pessoa getPassageiro() {
		return passageiro;
	}


	public void setPassageiro(Pessoa passageiro) {
		this.passageiro = passageiro;
	}


	public Pessoa getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}


	public Destino getDestino() {
		return destino;
	}


	public void setDestino(Destino destino) {
		this.destino = destino;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	

	
	
   
}
