package br.arnhold.cadastro.model;

public enum genero {
	
	M("Masculino"),
	F("Feminino");
	
	private String nome;

	public String getNome() {
		return nome;
	}

	private genero(String nome) {
		this.nome = nome;
	}
	
	

}
