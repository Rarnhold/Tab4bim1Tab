package br.arnhold.cadastro.model;

public class cliente {

	// Id, nome, telefone, endereço, cidade, estado (enum), email, gênero
	// (enum).
	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String cidade;
	private estado estado;
	private String email;
	private genero genero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public genero getGenero() {
		return genero;
	}

	public void setGenero(genero genero) {
		this.genero = genero;
	}

}
