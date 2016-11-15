package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.tads.dao.DAO;
import br.com.tads.modelo.Cidade;
import br.com.tads.modelo.Despesa;


@ManagedBean
@ViewScoped
public class DespesaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Despesa despesa = new Despesa();
	private Long idDespesa;
	private List<Despesa> despesas;

	public DespesaBean() {
		buscardespesas();
	}

	public void carregarDespesaPorId() {
		this.despesa = new DAO<Despesa>(Despesa.class).buscaPorId(idDespesa);
		this.despesa.getId();		
	}

	public String gravardespesa() {
		System.out.println("Gravando despesa" + this.despesa.getDescricao());		
		if(this.despesa.getId()==null){
			new DAO<Despesa>(Despesa.class).adiciona(this.despesa);
			System.out.println(this.despesa.getDescricao());
		} else {
			new DAO<Despesa>(Despesa.class).atualiza(this.despesa);
		}

		this.despesa = new Despesa();
		buscardespesas();

		return "despesa?faces-redirect=true";
	}

	public void remover(Despesa desp) {
		System.out.println("Removendo despesa " + desp.getDescricao());
		new DAO<Despesa>(Despesa.class).remove(desp);
		buscardespesas();

	}

	public List<Despesa> getdespesas() {

		return despesas;

	}

	private void buscardespesas() {
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

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	public Long getIdDespesa() {
		return idDespesa;
	}

	

}
	
