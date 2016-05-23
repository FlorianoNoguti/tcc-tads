package br.com.tads.modelo;

public enum TipoContrato {
	
	Mensalista("Mensalista"),
	Locacao("Locação"),
	Viagem("Viagem");
	
	private String descricao;
	
	TipoContrato(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
