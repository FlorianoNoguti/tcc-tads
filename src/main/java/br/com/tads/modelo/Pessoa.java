package br.com.tads.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pessoa")
	private Long id;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Column(nullable=false)
	@NotNull(message="Campo nome deve ser preenchido")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	private Date dataNascimento;
	
	@Column(length=11)
	private String cpf;
	
	private String rg;
	
	@Column(length=5)
	private String orgaoEmissorRg;
	
	
	@Column(nullable = false)
	@NotNull(message = "Campo CEP deve ser preenchido")
	private String cep;

	@Column(nullable = false)
	@NotNull(message = "Informar tipo logradouro: rua,avenida,etc")
	private String logradouro;

	@Column(nullable = false)
	@NotNull(message = "Campo endereço deve ser preenchido")
	private String endereco;

	@Column(nullable = false)
	@NotNull(message = "Campo número deve ser preenchido")
	private Integer numero;

	@Column(nullable = false)
	@NotNull(message = "Campo bairro deve ser preenchido")
	private String bairro;

	private String referencia;

	@JoinColumn(name = "id_cidade")
	@ManyToOne
	private Cidade cidade;

	@JoinColumn(name = "id_estado")
	@ManyToOne
	private Estado estado;

	@Column(nullable = false)
	@NotNull(message = "Campo telefone deve ser preenchido")
	private String telefone;
	
	
	private String email1;
	
	private String email2;
	

	private Double latitude;

	private Double longitude;

	@Column(nullable = false)
	private Boolean status;

	public Pessoa() {
		super();
	}

	public Long getId() {
		return id;
	}

	

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissorRg() {
		return orgaoEmissorRg;
	}

	public void setOrgaoEmissorRg(String orgaoEmissorRg) {
		this.orgaoEmissorRg = orgaoEmissorRg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	

	

}
