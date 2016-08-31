package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contrato
 *
 */
@Entity

public class Contrato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_contrato")
	private Long id;

	private TipoContrato tipoContrato;
	
	private String finalidadeViagem;
	
	private String localEmbarque;
	
	private String municipioPartida;
	
	private String localDesembarque;
	
	private String municipioDestino;
	
	private String roteiroViagem;
	
	private Date dataInicioContrato;
	
	private Date dataTerminoContrato;
	
	private Date dataSaida;
	
	private Integer horaSaida;
	private  Date dataRetorno;
	private Integer horaRetorno;
	private Double valorContrato;
	private Double custoKmRodado;
	private Double custoKmExcedente;
	private Integer nrNotaFiscal;
	private Date dtNotaFiscal;
	
	
	public Contrato() {
		super();
	}

	public Long getId() {
		return id;
	}

	

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getFinalidadeViagem() {
		return finalidadeViagem;
	}

	public void setFinalidadeViagem(String finalidadeViagem) {
		this.finalidadeViagem = finalidadeViagem;
	}

	public String getLocalEmbarque() {
		return localEmbarque;
	}

	public void setLocalEmbarque(String localEmbarque) {
		this.localEmbarque = localEmbarque;
	}

	public String getMunicipioPartida() {
		return municipioPartida;
	}

	public void setMunicipioPartida(String municipioPartida) {
		this.municipioPartida = municipioPartida;
	}

	public String getLocalDesembarque() {
		return localDesembarque;
	}

	public void setLocalDesembarque(String localDesembarque) {
		this.localDesembarque = localDesembarque;
	}

	public String getMunicipioDestino() {
		return municipioDestino;
	}

	public void setMunicipioDestino(String municipioDestino) {
		this.municipioDestino = municipioDestino;
	}

	public String getRoteiroViagem() {
		return roteiroViagem;
	}

	public void setRoteiroViagem(String roteiroViagem) {
		this.roteiroViagem = roteiroViagem;
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

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Integer getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Integer horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Integer getHoraRetorno() {
		return horaRetorno;
	}

	public void setHoraRetorno(Integer horaRetorno) {
		this.horaRetorno = horaRetorno;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Double getCustoKmRodado() {
		return custoKmRodado;
	}

	public void setCustoKmRodado(Double custoKmRodado) {
		this.custoKmRodado = custoKmRodado;
	}

	public Double getCustoKmExcedente() {
		return custoKmExcedente;
	}

	public void setCustoKmExcedente(Double custoKmExcedente) {
		this.custoKmExcedente = custoKmExcedente;
	}

	public Integer getNrNotaFiscal() {
		return nrNotaFiscal;
	}

	public void setNrNotaFiscal(Integer nrNotaFiscal) {
		this.nrNotaFiscal = nrNotaFiscal;
	}

	public Date getDtNotaFiscal() {
		return dtNotaFiscal;
	}

	public void setDtNotaFiscal(Date dtNotaFiscal) {
		this.dtNotaFiscal = dtNotaFiscal;
	}
	
	
   
}
