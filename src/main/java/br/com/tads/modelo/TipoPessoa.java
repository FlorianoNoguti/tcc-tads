package br.com.tads.modelo;

public enum TipoPessoa {
	
	Fisica("F�sica"),
	Juridica("Jur�dica");
	
	private String descricao;
	
	TipoPessoa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


}
