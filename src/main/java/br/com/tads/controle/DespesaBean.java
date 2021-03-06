package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import br.com.tads.dao.DAO;
import br.com.tads.modelo.Despesa;



@ManagedBean
@ViewScoped
public class DespesaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Despesa despesa = new Despesa();
	private Long idDespesa;
	private List<Despesa> despesas;

	public DespesaBean() {
		buscarDespesas();
	}

	public void carregarDespesaPelaId() {
		this.despesa = new DAO<Despesa>(Despesa.class).buscaPorId(idDespesa);
		this.despesa.getId();
	}

	public String gravarDespesa() {
		System.out.println("Gravando despesa " + this.despesa.getDescricao());

		if (this.despesa.getId() == null) {
			new DAO<Despesa>(Despesa.class).adiciona(this.despesa);
			System.out.println(this.despesa.getDescricao());
		} else {
			new DAO<Despesa>(Despesa.class).atualiza(this.despesa);
		}

		this.despesa = new Despesa();
		buscarDespesas();

		return "despesa?faces-redirect=true";
	}

	public void remover(Despesa desp) {
		System.out.println("Removendo despesa " + desp.getDescricao());
		new DAO<Despesa>(Despesa.class).remove(desp);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Despesa exclu�da com sucesso!"));
		buscarDespesas();
	}

	public List<Despesa> getDespesas() {
		DAO<Despesa> dao = new DAO<Despesa>(Despesa.class);
		if (this.despesas == null) {
			this.despesas = dao.listaTodos();
		}
		return despesas;

	}

	private void buscarDespesas() {
		DAO<Despesa> dao = new DAO<Despesa>(Despesa.class);
		if (this.despesas == null) {
			this.despesas = dao.listaTodos();
		}
	}

	

	public void criarNovoObjetoDespesa() {
		despesa = new Despesa();
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public Long getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Long idDespesa) {
		this.idDespesa = idDespesa;
	}

		
}
	
