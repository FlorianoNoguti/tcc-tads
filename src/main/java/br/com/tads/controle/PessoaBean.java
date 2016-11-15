package br.com.tads.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.tads.dao.DAO;
import br.com.tads.modelo.Pessoa;



@ManagedBean
@ViewScoped
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa = new Pessoa();
	private Long idPessoa;
	private List<Pessoa>pessoas = new ArrayList<>();

	public PessoaBean() {
		buscarPessoas();
	}

	public void carregarCidadePelaId() {
		this.pessoa = new DAO<Pessoa>(Pessoa.class).buscaPorId(idPessoa);
		this.pessoa.getId();
	}

	public String gravarPessoa() {
		System.out.println("Gravando Pessoa " + this.pessoa.getNomeRazaoSocial());

		if (this.pessoa.getId() == null) {
			new DAO<Pessoa>(Pessoa.class).adiciona(this.pessoa);
			System.out.println(this.pessoa.getNomeRazaoSocial());
		} else {
			new DAO<Pessoa>(Pessoa.class).atualiza(this.pessoa);
		}

		this.pessoa = new Pessoa();
		buscarPessoas();

		return "Pessoa?faces-redirect=true";

	}

	public void remover(Pessoa pessoa) {
		System.out.println("Removendo Pessoa " + pessoa.getNomeRazaoSocial());
		new DAO<Pessoa>(Pessoa.class).remove(pessoa);
		buscarPessoas();

	}

	public List<Pessoa> getPessoas() {

		return pessoas;

	}

	private void buscarPessoas() {
		DAO<Pessoa> dao = new DAO<Pessoa>(Pessoa.class);
		if (this.pessoas == null) {
			this.pessoas = dao.listaTodos();
		}
	}

	public void criarNovoObjetoPessoa() {
		pessoa = new Pessoa();
	}

	public Pessoa getpessoa() {
		return pessoa;
	}

	public void setpessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setPessoas(List<Pessoa> Pessoas) {
		this.pessoas = Pessoas;
	}

}
