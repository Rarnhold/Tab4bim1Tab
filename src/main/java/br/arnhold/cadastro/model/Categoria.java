package br.arnhold.cadastro.model;
//categoria (LIMPEZA, PE�AS, ALIMENTA��O, ETC)
public enum Categoria {
	Limpeza("Limpeza"),
	Pecas("Pe�as"),
	Alimentacao("Alimenta��o");
	

	private String nome;

	public String getNome() {
		return nome;
	}

	private Categoria(String nome) {
		this.nome = nome;
	}
	
}
