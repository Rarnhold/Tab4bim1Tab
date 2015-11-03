package br.arnhold.cadastro.model;

import java.math.BigDecimal;

//Id, código de barras, categoria (LIMPEZA, PEÇAS, ALIMENTAÇÃO, ETC), descrição, unidade (KG, UN, PCT, CX), custo (BigDecimal) e margem de lucro (BigDecimal).

public class Produto {
	private int id;
	private int codBarras;
	private Categoria categoria;
	private String descricao;
	private Unidade unidadeEmbalagem;
	private BigDecimal custo;
	private BigDecimal margemLucro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Unidade getUnidadeEmbalagem() {
		return unidadeEmbalagem;
	}

	public void setUnidadeEmbalagem(Unidade unidadeEmbalagem) {
		this.unidadeEmbalagem = unidadeEmbalagem;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}

}
