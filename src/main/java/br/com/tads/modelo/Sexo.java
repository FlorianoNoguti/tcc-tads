package br.com.tads.modelo;

public enum Sexo {
	
	Masculino("Masculino"),
	Feminino("Feminino");
	
	private String descricao;

	Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}

