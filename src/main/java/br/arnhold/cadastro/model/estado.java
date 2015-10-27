package br.arnhold.cadastro.model;

public enum estado {

	SC("Santa Catarina"),
	RS("Rio Grande do sul"),
	PR("Paran�"),
	MS("Mato Grosso do Sul"),
	MT("Mato Grosso"),
	AC("Acre"),
	AP("Amap�");
	
	
	
	private String nome;

	private estado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	

}
