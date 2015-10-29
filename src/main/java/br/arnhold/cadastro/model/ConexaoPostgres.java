package br.arnhold.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgres {

	private static Connection conexao;
	private static String url = "jdbc:postgresql://localhost:5432/BancoSmoke";
	private static String user = "postgres";
	private static String pass = "postgres";

	public ConexaoPostgres() {
		AbrirConexao();
	}

	private void AbrirConexao() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			System.out.println("Conex�o Estabelecida");
		} catch (SQLException e) {
			System.out.println("Erro de conex�o com banco de dados! \n N�: "
					+ e);
		}
	}

	/* teste da Conex�o com o banco de dados 
	 * public static void main(String[] args) {
		ConexaoPostgres c = new ConexaoPostgres();
	}*/

}
