package br.arnhold.cadastro.model;

import java.util.List;

public interface ClienteDao {
	
public void inserir(Cliente c);
	
	public void atualizar(Cliente c);
	
	public void excluir(Cliente c);
	
	public void buscar(Cliente c);
	
	public Cliente buscaPorExcemplo(Cliente c);
	
	public List<Cliente> lista();

}
