package br.arnhold.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ConexaoPostgres {

	private static Connection conexao;
	private static String url = "jdbc:postgresql://localhost:5432/BancoSmoke";
	private static String user = "postgres";
	private static String pass = "postgres";

	public ConexaoPostgres() {
		abrirConexao();

	}

	private void abrirConexao() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			JOptionPane.showMessageDialog(null, "Conexão Estabelecida");
			System.out.println("Conexão Estabelecida");
		} catch (SQLException e) {
			System.out.println("Erro de conexão com banco de dados! \n Nº: "
					+ e);
		}
	}

	private void fecharConexao() {
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cadastraCliente(Cliente c) {
		// String sql =
		// "INSERT INTO TrecCliente (ID, NOME ,TELEFONE,ENDERECO,CIDADE,ESTADO,EMAIL,GENERO) VALUES (?, ?, ?, ?,?, ?, ?, ?)";
		String sql = "INSERT INTO TrecCliente (ID, NOME ,TELEFONE,ENDERECO,CIDADE,EMAIL) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setInt(1, c.getId());
			pst.setString(2, c.getNome());
			pst.setString(3, c.getTelefone());
			pst.setString(4, c.getEndereco());
			pst.setString(5, c.getCidade());
			// pst.setString(6, "1");
			pst.setString(6, c.getEmail());
			// pst.setString(8, "1");

			// executa o sql
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Salvo Com Sucesso");
			pst.close();

		} catch (SQLException e) {
			try {
				if (conexao != null) {
					conexao.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				fecharConexao();
			}
			System.out.println("Erro ao inserir Contato! \n ERRO: " + e);
		}

	}

	public List<Cliente> listaContatos() {
		String sql = "select * from treccliente order by 1 ";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		PreparedStatement pst;
		try {
			pst = conexao.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt("ID"));
				c.setNome(rs.getString("Nome"));
				c.setTelefone(rs.getString("Telefone"));
				c.setEndereco(rs.getString("Endereco"));
				c.setCidade(rs.getString("Cidade"));
		      //c.setEstado(rs.getString(columnLabel));
				c.setEmail(rs.getString("Email"));
			  //c.setGenero(rs.getString("");
				listaClientes.add(c);
			}
		} catch (SQLException e) {
			try {
				if (conexao != null){
					conexao.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();	
				fecharConexao();
			}
			e.printStackTrace();
		}
		return listaClientes;
	}

}
