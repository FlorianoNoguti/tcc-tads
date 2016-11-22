package br.com.tads.modelo;

import java.io.Serializable;

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

	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dataInicioContrato", nullable = false)
	private Date dataInicioContrato;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dataTerminoContrato", nullable = false)
	private Date dataTerminoContrato;
	
	@JoinColumn(name = "id_passageiro")
	@ManyToOne
	private Pessoa passageiro;
	
	@JoinColumn(name = "id_responsavel")
	@ManyToOne
	private Pessoa responsavel;
	
	@JoinColumn(name = "id_destino")
	@ManyToOne
	private Destino destino;
	
	@JoinColumn(name = "id_pessoa")
	@ManyToOne
	private Funcionario funcionario;
	
	@JoinColumn(name = "id_veiculo")
	@ManyToOne
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


	public Date getDataInicioContrato() {
		return dataInicioContrato;
	}


	public void setDataInicioContrato(Date dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}


	public Date getDataTerminoContrato() {
		return dataTerminoContrato;
	}


	public void setDataTerminoContrato(Date dataTerminoContrato) {
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
