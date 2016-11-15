package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Cidade;
import br.com.tads.modelo.Estado;

@ManagedBean
@ViewScoped
public class CidadeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Cidade cidade = new Cidade();
	private Long idCidade;
	private List<Cidade> cidades;

	public CidadeBean() {
		buscarCidades();
	}

	public void carregarCidadePelaId() {
		this.cidade = new DAO<Cidade>(Cidade.class).buscaPorId(idCidade);
		this.cidade.getId();
	}

	public String gravarCidade() {
		System.out.println("Gravando cidade " + this.cidade.getNome());

		if (this.cidade.getId() == null) {
			new DAO<Cidade>(Cidade.class).adiciona(this.cidade);
			System.out.println(this.cidade.getNome());
		} else {
			new DAO<Cidade>(Cidade.class).atualiza(this.cidade);
		}

		this.cidade = new Cidade();
		buscarCidades();

		return "cidade?faces-redirect=true";
	}

	public void remover(Cidade cid) {
		System.out.println("Removendo cidade " + cid.getNome());
		new DAO<Cidade>(Cidade.class).remove(cid);
		buscarCidades();

	}

	public List<Cidade> getCidades() {
		DAO<Cidade> dao = new DAO<Cidade>(Cidade.class);
		if (this.cidades == null) {
			this.cidades = dao.listaTodos();
		}
		return cidades;

	}

	private void buscarCidades() {
		DAO<Cidade> dao = new DAO<Cidade>(Cidade.class);
		if (this.cidades == null) {
			this.cidades = dao.listaTodos();
		}
	}

	public void criarNovoObjetoCidade() {
		cidade = new Cidade();
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

}
