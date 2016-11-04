package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

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

	@Column(name = "tipoPessoa")
	private String tipoPessoa;

	private LocalDateTime dtCadastro = LocalDateTime.now();

	private Boolean status = true;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(name = "nome", nullable = false)
	@NotNull(message = "Campo nome deve ser preenchido")
	private String nomeRazaoSocial;

	@Column(name = "dtNascimento", nullable = false)
	@NotNull(message = "Campo data de nascimento deve ser preenchida")
	private LocalDateTime dtNascimento;

	@Column(name = "cpf_cnpj", nullable = false)
	@NotNull(message = "Campo cpf/cnpj deve ser preenchido")
	private String cpfCnpj;

	@Column(name = "rg_inscrEstadual", nullable = false)
	@NotNull(message = "Campo rg/inscrição estadul deve ser preenchido")
	private String rgInscrEstadual;

	@Column(nullable = false, name = "cep")
	@NotNull(message = "Campo CEP deve ser preenchido")
	private String cep;

	@Column(nullable = false)
	@NotNull(message = "Campo endereço deve ser preenchido")
	private String endereco;

	private Integer numero;

	@Column(nullable = false)
	@NotNull(message = "Campo bairro deve ser preenchido")
	private String bairro;

	private String pontoReferencia;

	@JoinColumn(name = "id_cidade")
	@ManyToOne
	private Cidade cidade;

	@JoinColumn(name = "id_estado")
	@ManyToOne
	private Estado estado;

	@Column(nullable = false)
	private String telefone;

	private Double latitude;

	private Double longitude;

	private String nomeResponsavel;

	private String cpfResponsavel;

	private String rgResponsavel;

	@Email
	private String email1;

	private String email2;
	
	public Pessoa() {
		super();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Boolean getStatus() {
		return status;
	}

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}


	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	

	public LocalDateTime getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDateTime dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getRgInscrEstadual() {
		return rgInscrEstadual;
	}

	public void setRgInscrEstadual(String rgInscrEstadual) {
		this.rgInscrEstadual = rgInscrEstadual;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
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

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}

	public String getRgResponsavel() {
		return rgResponsavel;
	}

	public void setRgResponsavel(String rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
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

	

}
