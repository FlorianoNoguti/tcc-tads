package br.com.tads.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Veiculo
 *
 */
@Entity
@Table(name="veiculo")

public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_veiculo")
	private Long id;
	private String modelo;
	private String marca;
	private Double quilometragem;
	private Integer ano;
	private Integer qtde_passageiros;
	private String renavam;
	private Boolean ipva;
	private Boolean licenciamento;
	private Boolean dpvat;
	private String placa;
	

	public Veiculo() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Double getQuilometragem() {
		return quilometragem;
	}


	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public Integer getQtde_passageiros() {
		return qtde_passageiros;
	}


	public void setQtde_passageiros(Integer qtde_passageiros) {
		this.qtde_passageiros = qtde_passageiros;
	}


	public String getRenavam() {
		return renavam;
	}


	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}


	public Boolean getIpva() {
		return ipva;
	}


	public void setIpva(Boolean ipva) {
		this.ipva = ipva;
	}


	public Boolean getLicenciamento() {
		return licenciamento;
	}


	public void setLicenciamento(Boolean licenciamento) {
		this.licenciamento = licenciamento;
	}


	public Boolean getDpvat() {
		return dpvat;
	}


	public void setDpvat(Boolean dpvat) {
		this.dpvat = dpvat;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
   
}
