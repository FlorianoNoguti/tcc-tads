package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tads.dao.DAO;
import br.com.tads.modelo.Cidade;
import br.com.tads.modelo.Destino;
import br.com.tads.modelo.Estado;


@ManagedBean
@ViewScoped
public class DestinoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Destino destino = new Destino();	
	private Long idDestino;	
	private List<Destino> destinos;
	
	public DestinoBean(){
		buscarDestinos();
	}
	
	public void carregarDestinoPelaId(){
		this.destino = new DAO<Destino>(Destino.class).buscaPorId(idDestino);
		this.destino.getId();
		}
			 
	public String gravar(){
		System.out.println("Gravando destino" + this.destino.getDescricao());
		
		if(this.destino.getId() == null) {
			new DAO<Destino>(Destino.class).adiciona(this.destino);
			System.out.println(this.destino.getDescricao());
		} else {
			new DAO<Destino>(Destino.class).atualiza(this.destino);
		}

		this.destino = new Destino();

		return "Destino?faces-redirect=true";
		}
	
	public void remover(Destino destino){
		System.out.println("Removendo tipo de despesa" + destino.getDescricao());
		new DAO<Destino>(Destino.class).remove(destino);		
		
		}
	
	public List<Destino>getDestinos(){
		DAO<Destino> dao = new DAO<Destino>(Destino.class);

		if(this.destinos == null){
			this.destinos = dao.listaTodos();
		}
		return destinos;
		
		}
	
	private void buscarDestinos() {
		DAO<Destino> dao = new DAO<Destino>(Destino.class);
		if (this.destinos == null) {
			this.destinos = dao.listaTodos();
		}
	}

	
	public void criarNovoObjetoDestino() {
        destino = new Destino();
    }
	

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}

	public void setDestinos(List<Destino> destinos) {
		this.destinos = destinos;
	}
	
	
}
