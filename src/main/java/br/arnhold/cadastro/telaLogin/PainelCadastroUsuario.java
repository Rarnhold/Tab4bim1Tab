package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import net.miginfocom.swing.MigLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.springframework.ui.Model;

import br.arnhold.cadastro.model.Cliente;
import br.arnhold.cadastro.model.ConexaoPostgres;
import br.arnhold.cadastro.model.Estado;
import br.arnhold.cadastro.model.Genero;
import br.arnhold.cadastro.model.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class PainelCadastroUsuario extends JPanel {
	private JTextField txtIdUsuario;
	private JTextField txtIdCliente;
	private JTextField txtSenha;
	private JTable table;
	// chamada da tela de impressão inferior da tela de Usuario
	private TabelaUsuario model = new TabelaUsuario();
	
	private Usuario UsuarioSelecionado = null;
	//chamada da tela tabela de usauario
	private TabelaUsuario tabelausuario = new TabelaUsuario();

	/**
	 * Create the panel.
	 */
	public PainelCadastroUsuario() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("ID:");
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		
		txtIdCliente = new JTextField();
		txtIdCliente.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnNewButton = new JButton("Delete");
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel)
					.addGap(28)
					.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(219))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(232)
					.addComponent(btnCancelar)
					.addGap(4)
					.addComponent(btnNewButton)
					.addGap(4)
					.addComponent(btnGravar))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblId)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtIdUsuario, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCliente)
							.addGap(25)
							.addComponent(txtIdCliente, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(txtIdUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCliente))
						.addComponent(txtIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel)
							.addGap(7)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCancelar)
								.addComponent(btnNewButton)
								.addComponent(btnGravar)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(1))
		);
		panel.setLayout(gl_panel);
		atualizaTabela();
		System.out.println("saiu");

	}

	private void atualizaTabela() {
		ConexaoPostgres con = new ConexaoPostgres();
		model.setLista((ArrayList<Usuario>) con.listaUsuario());
		model.fireTableDataChanged();
		
		txtIdUsuario.setText(Integer.toString(con.ultimoUsuario + 1));
	}
	

	private void gravarUsuario() {

		if (UsuarioSelecionado == null) {
			Usuario u = new Usuario();
			u.setIdCliente(Integer.parseInt(txtIdCliente.getText().trim()));
			u.setId(Integer.parseInt(txtIdUsuario.getText().trim()));
			u.setSenha(Integer.parseInt(txtSenha.getText().trim()));

			ConexaoPostgres con = new ConexaoPostgres();
			con.cadastraUsuario(u);
			atualizaTabela();
			limpaCamposTransacao();

		} else {
			UsuarioSelecionado.setIdCliente(Integer.parseInt(txtIdCliente.getText().trim()));
			UsuarioSelecionado.setId(Integer.parseInt(txtIdUsuario.getText().trim()));
			UsuarioSelecionado.setSenha(Integer.parseInt(txtSenha.getText().trim()));
			
			ConexaoPostgres con = new ConexaoPostgres();
			con.updateUsuario(UsuarioSelecionado);
			atualizaTabela();
			limpaCamposTransacao();
	}
}

	private void limpaCamposTransacao() {
		
		
	}
}
