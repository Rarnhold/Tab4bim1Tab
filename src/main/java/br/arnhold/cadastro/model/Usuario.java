package br.arnhold.cadastro.model;

public class Usuario extends Cliente {
	private int id;
	private int idCliente;
	private int senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int i) {
		this.idCliente = i;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
