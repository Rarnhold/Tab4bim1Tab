package br.arnhold.cadastro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

public class ClienteDaoPostgres implements ClienteDao {

	private Connection conexao;
	// Defini as Sql q seram utilizadas nos métodos abaixo\\
	private static final String SQL_INSERT = "INSERT INTO CLIENTE (ID, NOME ,TELEFONE,ENDERECO,CIDADE,ESTADO,EMAIL,GENERO) VALUES (?, ?, ?, ?,?, ?, ?, ?)";

	public void inserir(Cliente c) {
		ConexaoPostgres con = new ConexaoPostgres();
		try {
			PreparedStatement pst = conexao.prepareStatement(SQL_INSERT);
			// Valores para inserir nos parametros
			pst.setInt(1, c.getId());
			pst.setString(2, c.getNome());
			pst.setString(3, c.getTelefone());
			pst.setString(4, c.getEndereco());
			pst.setString(5, c.getCidade());
			// pst.setInt(6, c.getEstado());
			pst.setString(7, c.getEmail());
			// pst.setString(8, c.getGenero());

			// executa o sql
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo Com Sucesso");
			pst.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao inserir Cliente! \n ERRO: " + e);
		}

	}

	public void atualizar(Cliente c) {
		// TODO Auto-generated method stub

	}

	public void excluir(Cliente c) {
		// TODO Auto-generated method stub

	}

	public void buscar(Cliente c) {
		// TODO Auto-generated method stub

	}

	public Cliente buscaPorExcemplo(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> lista() {
		// TODO Auto-generated method stub
		return null;
	}

}
