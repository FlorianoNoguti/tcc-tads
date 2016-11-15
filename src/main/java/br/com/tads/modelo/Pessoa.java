package br.com.tads.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pessoa")
	private Long id;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name="dt_cadastro",nullable=false)
	private Date dtCadastro = new Date();

	@Column(name="status")
	private Boolean status = true;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@NotEmpty
	@Column(name = "nome", nullable = false)
	private String nomeRazaoSocial;

	@NotEmpty
	@Past
	@Column(name = "dt_nascimento", nullable = false)
	private LocalDate dtNascimento;

	@NotEmpty
	@Column(name = "cpf_cnpj", nullable = false)
	private String cpfCnpj;	

	@NotEmpty
	@Column(name = "rg_inscrEstadual", nullable = false)
	private String rgInscrEstadual;

	@NotEmpty	
	@Column(name = "cep",nullable=false)
	private String cep;

	@NotEmpty
	@Column(name="endereco",nullable = false)
	private String endereco;

	@NotNull
	@Column(name="numero",nullable=false)
	private Integer numero;

	@NotEmpty
	@Column(name="bairro",nullable = false)
	private String bairro;

	
	@Column(name="ponto_referencia")
	private String pontoReferencia;

	@JoinColumn(name = "id_cidade")
	@ManyToOne
	private Cidade cidade;

	@JoinColumn(name = "id_estado")
	@ManyToOne
	private Estado estado;

	@NotEmpty
	@Column(name="telefone",nullable = false)
	private String telefone;

	@NotNull
	@Column(name="latitude_pessoa",nullable=false)
	private Double latitude;
	
	@NotNull
	@Column(name="longitude_pessoa",nullable=false)
	private Double longitude;

	@Column(name="nome_responsavel")
	private String nomeResponsavel;

	
	@Column(name="cpf_responsavel")
	private String cpfResponsavel;

	@Column(name="rg_responsavel")
	private String rgResponsavel;

	@Email
	@Column(name="email")
	private String email1;
		
	public Pessoa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Boolean getStatus() {
		return status;
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

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
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

		
}
