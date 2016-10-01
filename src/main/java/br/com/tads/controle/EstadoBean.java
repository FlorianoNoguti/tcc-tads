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
public class EstadoBean implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Estado estado = new Estado();
	
	private Long idEstado;
	
	private List<Estado> estados;
	

	
	
	public void carregarEstadoPelaId() {
		this.estado = new DAO<Estado>(Estado.class).buscaPorId(idEstado);
		this.estado.getId();
	}

	public String gravar() {
		System.out.println("Gravando estado " + this.estado.getNome());

		if(this.estado.getId() == null) {
			new DAO<Estado>(Estado.class).adiciona(this.estado);
			System.out.println(this.estado.getNome());
		} else {
			new DAO<Estado>(Estado.class).atualiza(this.estado);
		}

		this.estado = new Estado();

		return "estado?faces-redirect=true";
	}
	
	public void remover() {
		System.out.println("Removendo estado " + estado.getNome());
		new DAO<Estado>(Estado.class).remove(estado);
	}
	
	
	public List<Estado> getEstados() {
		DAO<Estado> dao = new DAO<Estado>(Estado.class);
		if(this.estados == null){
			this.estados = dao.listaTodos();
		}
		return estados;
		
		}
	
	public void criarNovoObjetoEstado() {
        estado = new Estado();
    }
	
	
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	
	
}
