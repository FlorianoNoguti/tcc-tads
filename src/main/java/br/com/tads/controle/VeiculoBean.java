package br.com.tads.controle;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.tads.dao.DAO;
import br.com.tads.modelo.Cidade;
import br.com.tads.modelo.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Veiculo veiculo = new Veiculo();
	private Long idVeiculo;
	private List<Veiculo> veiculos;

	public VeiculoBean() {
		buscarVeiculos();
	}

	public void carregarVeiculoPorId() {
		this.veiculo = new DAO<Veiculo>(Veiculo.class).buscaPorId(idVeiculo);
		this.veiculo.getId();		
	}

	public String gravarVeiculo() {
		System.out.println("Gravando veiculo" + this.veiculo.getModelo());
		
		if(this.veiculo.getId()==null){
			new DAO<Veiculo>(Veiculo.class).adiciona(this.veiculo);
			System.out.println(this.veiculo.getModelo());
		} else {
			new DAO<Veiculo>(Veiculo.class).atualiza(this.veiculo);
		}

		this.veiculo = new Veiculo();
		buscarVeiculos();

		return "veiculo?faces-redirect=true";
	}

	public void remover(Veiculo veic) {
		System.out.println("Removendo veiculo " + veic.getMarca());
		new DAO<Veiculo>(Veiculo.class).remove(veic);
		buscarVeiculos();

	}

	public List<Veiculo> getVeiculos() {
		DAO<Veiculo> dao = new DAO<Veiculo>(Veiculo.class);
		if (this.veiculos == null) {
			this.veiculos = dao.listaTodos();
		}
		return veiculos;

	}

	private void buscarVeiculos() {
		DAO<Veiculo> dao = new DAO<Veiculo>(Veiculo.class);
		if (this.veiculos == null) {
			this.veiculos = dao.listaTodos();
		}
	}

	public void criarNovoObjetoVeiculo() {
		veiculo = new Veiculo();
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}	

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
	
