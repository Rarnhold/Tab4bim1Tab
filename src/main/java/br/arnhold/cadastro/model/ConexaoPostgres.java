package br.arnhold.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.bouncycastle.jce.provider.JDKDSASigner.noneDSA;
import org.eclipse.jdt.internal.compiler.lookup.IQualifiedTypeResolutionListener;

public class ConexaoPostgres {

	private static Connection conexao;
	private static String url = "jdbc:postgresql://localhost:5432/BancoSmoke";
	private static String user = "postgres";
	private static String pass = "postgres";
	public int ultimoCliente;
	public int ultimoUsuario;

	public ConexaoPostgres() {
		abrirConexao();

	}

	private void abrirConexao() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			// JOptionPane.showMessageDialog(null, "Conexão Estabelecida");
			// System.out.println("Conexão Estabelecida");
		} catch (SQLException e) {
			System.out.println("Erro de conexão com banco de dados! \n Nº: "
					+ e);
		}
	}

	private void fecharConexao() {
		try {
			conexao.close();
			System.out.println("Conexão encerrada");
		} catch (SQLException e) {
			System.out
					.println("Processo de encerramento com o banco apresentou falha:"
							+ e);
		}
	}

	public void cadastraCliente(Cliente c) {

		String sql = "INSERT INTO TrecCliente (ID, NOME ,TELEFONE,ENDERECO,CIDADE,ESTADO,EMAIL,GENERO) VALUES (?, ?, ?, ?,?, ?, ?, ?)";

		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setInt(1, c.getId());
			pst.setString(2, c.getNome());
			pst.setString(3, c.getTelefone());
			pst.setString(4, c.getEndereco());
			pst.setString(5, c.getCidade());
			pst.setString(6, c.getEstado().name());
			pst.setString(7, c.getEmail());
			pst.setString(8, c.getGenero().name());

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
			JOptionPane.showMessageDialog(null,
					("Erro ao inserir Contato! \n ERRO: " + e));
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
				c.setEstado(Estado.valueOf(rs.getString("estado")));
				c.setEmail(rs.getString("Email"));
				c.setGenero(Genero.valueOf(rs.getString("genero")));
				listaClientes.add(c);
				ultimoCliente = c.getId();
			}
		} catch (SQLException e) {
			try {
				if (conexao != null) {
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

	public void updateCliente(Cliente contatoSelecionado) {
		String sql = "UPDATE treccliente SET NOME=? ,TELEFONE=?,ENDERECO=?,CIDADE=?,ESTADO=?,EMAIL=?,GENERO=? WHERE ID=?";
		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setString(1, contatoSelecionado.getNome());
			pst.setString(2, contatoSelecionado.getTelefone());
			pst.setString(3, contatoSelecionado.getEndereco());
			pst.setString(4, contatoSelecionado.getCidade());
			pst.setString(5, contatoSelecionado.getEstado().name());
			pst.setString(6, contatoSelecionado.getEmail());
			pst.setString(7, contatoSelecionado.getGenero().name());
			pst.setInt(8, contatoSelecionado.getId());
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
			pst.close();
			fecharConexao();

		} catch (SQLException e) {
			try {
				if (conexao != null) {
					conexao.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				fecharConexao();
			}
			System.out.println("Erro ao Atualizar o Cliente! \n ERRO: " + e);
			fecharConexao();
		}

	}

	public void deletaCliente(Cliente contatoSelecionado) {
		String sql = "DELETE FROM treccliente where ID =?";
		int resposta;
		resposta = JOptionPane.showConfirmDialog(null,
				"Deseja realmente deletar cliente");
		if (resposta == JOptionPane.YES_OPTION) {
			try {
				PreparedStatement pst = conexao.prepareStatement(sql);
				pst.setInt(1, contatoSelecionado.getId());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Contato Deletado");
				fecharConexao();
			} catch (SQLException e) {
				try {
					if (conexao != null) {
						conexao.rollback();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					fecharConexao();
				}
				System.out.println("Erro ao Deletar o Clinte! \n" + e);
				fecharConexao();
			}
		} else {

		}
	}

	public ArrayList<Usuario> listaUsuario() {
		String sql = "select * from tusuario order by 1 ";
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		PreparedStatement pst;

		try {
			pst = conexao.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Usuario u = new Usuario();

				u.setIdCliente(rs.getInt("idcliente"));
				u.setId(rs.getInt("id"));
				u.setSenha(rs.getInt("senha"));
				listaUsuarios.add(u);
				ultimoUsuario = u.getId();
			}
		} catch (SQLException e) {
			try {
				if (conexao != null) {
					conexao.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				fecharConexao();
			}
			e.printStackTrace();
		}
		return listaUsuario();
	}

	public void cadastraUsuario(Usuario u) {
		String sql = "INSERT INTO tusuario(idcliente, id, senha) VALUES (?, ?, ?);";
		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setInt(1, u.getIdCliente());
			pst.setInt(2, u.getId());
			pst.setInt(3, u.getSenha());
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
			JOptionPane.showMessageDialog(null,
					("Erro ao inserir Contato! \n ERRO: " + e));
		}
		
	}

	public void updateUsuario(Usuario usuarioSelecionado) {
		// TODO Auto-generated method stub
		
	}
	
	
}