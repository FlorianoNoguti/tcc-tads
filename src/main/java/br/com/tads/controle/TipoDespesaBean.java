package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Cidade;
import br.com.tads.modelo.TipoDespesa;

@ManagedBean
@ViewScoped
public class TipoDespesaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private TipoDespesa tpDespesa = new TipoDespesa();	
	private Long idTipoDespesa;	
	private List<TipoDespesa> tiposDespesa;
	
	public void carregarTipoDespesaPelaId(){
		this.tpDespesa = new DAO<TipoDespesa>(TipoDespesa.class).buscaPorId(idTipoDespesa);
		this.tpDespesa.getId();
		}
			 
	public String gravar(){
		System.out.println("Gravando tipo de despesa" + this.tpDespesa.getDescricao());
		
		if(this.tpDespesa.getId() == null) {
			new DAO<TipoDespesa>(TipoDespesa.class).adiciona(this.tpDespesa);
			System.out.println(this.tpDespesa.getDescricao());
			FacesContext context = FacesContext.getCurrentInstance();
		} else {
			new DAO<TipoDespesa>(TipoDespesa.class).atualiza(this.tpDespesa);
		}

		this.tpDespesa = new TipoDespesa();

		return "tipoDespesa?faces-redirect=true";
		}
	
	public void remover(TipoDespesa tpDespesa){
		System.out.println("Removendo tipo de despesa" + tpDespesa.getDescricao());
		new DAO<TipoDespesa>(TipoDespesa.class).remove(tpDespesa);		
		buscarTiposDespesa();
		}
	
	
	
	
	public List<TipoDespesa>getTiposDespesa(){
		DAO<TipoDespesa> dao = new DAO<TipoDespesa>(TipoDespesa.class);

		if(this.tiposDespesa == null){
			this.tiposDespesa = dao.listaTodos();
		}
		return tiposDespesa;
		
		}
	
	private void buscarTiposDespesa() {
		DAO<TipoDespesa> dao = new DAO<TipoDespesa>(TipoDespesa.class);
		if (this.tiposDespesa == null) {
			this.tiposDespesa = dao.listaTodos();
		}
	}
	
	public void criarNovoObjetoTipoDespesa() {
	    tpDespesa = new TipoDespesa();
		}

	public TipoDespesa getTpDespesa() {
		return tpDespesa;
	}

	public void setTpDespesa(TipoDespesa tpDespesa) {
		this.tpDespesa = tpDespesa;
	}

	public Long getIdTipoDespesa() {
		return idTipoDespesa;
	}

	public void setTiposDespesa(List<TipoDespesa> tiposDespesa) {
		this.tiposDespesa = tiposDespesa;
	}			

}
