package br.arnhold.cadastro.model;

public enum Genero {
	
	M("Masculino"),
	F("Feminino");
	
	private String nome;

	public String getNome() {
		return nome;
	}

	private Genero(String nome) {
		this.nome = nome;
	}
	
	

}
