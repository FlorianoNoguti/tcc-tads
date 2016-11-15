package br.com.tads.modelo;

public enum TipoPessoa {
	
	Fisica("Física"),
	Juridica("Jurídica");
	
	private String descricao;
	
	TipoPessoa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


}
