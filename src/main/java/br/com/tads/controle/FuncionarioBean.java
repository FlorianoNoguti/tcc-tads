package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Funcionario;
import br.com.tads.modelo.Sexo;

@ManagedBean
@ViewScoped
public class FuncionarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Funcionario funcionario = new Funcionario();
	private Long idFuncionario;
	private List<Funcionario> Funcionarios;

	public FuncionarioBean() {
		buscarFuncionarios();
	}

	public void carregarFuncionarioPelaId() {
		this.funcionario = new DAO<Funcionario>(Funcionario.class).buscaPorId(idFuncionario);
		this.funcionario.getId();
	}

	public String gravarFuncionario() {
		System.out.println("Gravando Funcionario " + this.funcionario.getNomeRazaoSocial());

		if (this.funcionario.getId() == null) {
			new DAO<Funcionario>(Funcionario.class).adiciona(this.funcionario);
			System.out.println(this.funcionario.getNomeRazaoSocial());
		} else {
			new DAO<Funcionario>(Funcionario.class).atualiza(this.funcionario);
		}

		this.funcionario = new Funcionario();
		buscarFuncionarios();

		return "Funcionario?faces-redirect=true";
	}

	public void remover(Funcionario cid) {
		System.out.println("Removendo Funcionario " + cid.getCidade().getNome());
		new DAO<Funcionario>(Funcionario.class).remove(cid);
		buscarFuncionarios();

	}

	public List<Funcionario> getFuncionarios() {
		DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);
		if (this.Funcionarios == null) {
			this.Funcionarios = dao.listaTodos();
		}
		return Funcionarios;

	}

	private void buscarFuncionarios() {
		DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);
		if (this.Funcionarios == null) {
			this.Funcionarios = dao.listaTodos();
		}
	}

	public void criarNovoObjetoFuncionario() {
		funcionario = new Funcionario();
	}

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario Funcionario) {
		this.funcionario = Funcionario;
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

}