package br.arnhold.cadastro.model;
//categoria (LIMPEZA, PEÇAS, ALIMENTAÇÃO, ETC)
public enum Categoria {
	Limpeza("Limpeza"),
	Pecas("Peças"),
	Alimentacao("Alimentação");
	

	private String nome;

	public String getNome() {
		return nome;
	}

	private Categoria(String nome) {
		this.nome = nome;
	}
	
}
