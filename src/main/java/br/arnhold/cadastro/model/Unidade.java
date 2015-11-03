package br.arnhold.cadastro.model;
//unidade (KG, UN, PCT, CX)
public enum Unidade {

	KG("Kilo Grama"),
	UN("Unidade"),
	PCT("Pacote"),
	CX("Caixa");
	
	private String nome;

	public String getNome() {
		return nome;
	}

	private Unidade(String nome) {
		this.nome = nome;
	}
}
