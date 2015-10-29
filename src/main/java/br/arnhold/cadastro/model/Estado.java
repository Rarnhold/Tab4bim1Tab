package br.arnhold.cadastro.model;

public enum Estado {

	SC("Santa Catarina"),
	RS("Rio Grande do sul"),
	PR("Paraná"),
	MS("Mato Grosso do Sul"),
	MT("Mato Grosso"),
	AC("Acre"),
	AP("Amapá");
	
	
	
	private String nome;

	private Estado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	

}
