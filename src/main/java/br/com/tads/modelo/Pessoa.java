package br.com.tads.modelo;

import java.io.Serializable;
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

	
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	@Temporal(TemporalType.DATE)
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

	@NotNull
	@Past
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", nullable = false)
	private Date dtNascimento;

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

	
	@Column(name="latitude_pessoa")
	private Double latitude;
	
	
	@Column(name="longitude_pessoa")
	private Double longitude;

	@Column(name="nome_responsavel")
	private String nomeResponsavel;

	
	@Column(name="cpf_responsavel")
	private String cpfResponsavel;

	@Column(name="rg_responsavel")
	private String rgResponsavel;

	@Email
	@Column(name="email")
	private String email;
		
	public Pessoa() {
		super();
	}

	public Pessoa(String nomeRazaoSocial,String cpfCnpj,String rgInscrEstadual,String telefone){
		this.nomeRazaoSocial = nomeRazaoSocial;
		this.cpfCnpj = cpfCnpj;
		this.rgInscrEstadual = rgInscrEstadual;
		this.telefone = telefone;
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

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
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
		return email;
	}

	public void setEmail1(String email1) {
		this.email = email1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeRazaoSocial == null) ? 0 : nomeRazaoSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeRazaoSocial == null) {
			if (other.nomeRazaoSocial != null)
				return false;
		} else if (!nomeRazaoSocial.equals(other.nomeRazaoSocial))
			return false;
		return true;
	}

	

	
}
