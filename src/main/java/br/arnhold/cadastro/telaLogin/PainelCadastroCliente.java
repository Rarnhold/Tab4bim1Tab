package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.arnhold.cadastro.model.Cliente;
import br.arnhold.cadastro.model.ConexaoPostgres;
import br.arnhold.cadastro.model.Estado;
import br.arnhold.cadastro.model.Genero;

import javax.swing.JButton;

import org.eclipse.jdt.internal.compiler.ast.Clinit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PainelCadastroCliente extends JPanel {
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtEmail;
	private JLabel lblNome;
	private JLabel lblTelefone;
	private JLabel lblEndereo;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JLabel lblEmail;
	private JLabel lblGnero;
	private JScrollPane scrollPane;
	private JTable table;
	private JComboBox cbxEstado;
	private JComboBox cbxGenero;

	// chamada da tela de impressão inferior da tela de cadastro
	private TabelaCliente model = new TabelaCliente();

	// verifica se existe contato selecionado
	private Cliente contatoSelecionado;

	private TabelaCliente tabelaCliente = new TabelaCliente();

	/**
	 * Create the panel.
	 *
	 */

	public PainelCadastroCliente() {

		JLabel lblId = new JLabel("ID");

		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setColumns(10);

		lblNome = new JLabel("Nome");

		txtNome = new JTextField();
		txtNome.setColumns(10);

		lblTelefone = new JLabel("Telefone");

		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);

		lblEndereo = new JLabel("Endere\u00E7o");

		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);

		lblCidade = new JLabel("Cidade");

		txtCidade = new JTextField();
		txtCidade.setColumns(10);

		lblEstado = new JLabel("Estado");

		cbxEstado = new JComboBox();

		lblEmail = new JLabel("Email");

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		lblGnero = new JLabel("G\u00EAnero");

		cbxGenero = new JComboBox();

		scrollPane = new JScrollPane();

		table = new JTable(model);

		table.addMouseListener(new MouseAdapter() {
			@Override
			// carrega contat nos edit
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 2) {
					carregaContato(model.getLista().get(table.getSelectedRow()));

				}
			}
		});

		scrollPane.setViewportView(table);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gravarCliente();
			}
		});

		JButton btnDelete = new JButton("Delete");

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelaTransacao();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(17)
																		.addComponent(
																				lblId)
																		.addGap(22)
																		.addComponent(
																				txtId,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(9)
																		.addComponent(
																				lblNome)
																		.addGap(14)
																		.addComponent(
																				txtNome,
																				GroupLayout.PREFERRED_SIZE,
																				265,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(8)
																		.addComponent(
																				lblGnero)
																		.addGap(4)
																		.addComponent(
																				cbxGenero,
																				GroupLayout.PREFERRED_SIZE,
																				87,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblTelefone)
																		.addGap(5)
																		.addComponent(
																				txtTelefone,
																				GroupLayout.PREFERRED_SIZE,
																				399,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblEndereo)
																		.addGap(5)
																		.addComponent(
																				txtEndereco,
																				GroupLayout.PREFERRED_SIZE,
																				399,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(12)
																		.addComponent(
																				lblCidade)
																		.addGap(5)
																		.addComponent(
																				txtCidade,
																				GroupLayout.PREFERRED_SIZE,
																				265,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(4)
																		.addComponent(
																				lblEstado)
																		.addGap(4)
																		.addComponent(
																				cbxEstado,
																				GroupLayout.PREFERRED_SIZE,
																				93,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(21)
																		.addComponent(
																				lblEmail)
																		.addGap(5)
																		.addComponent(
																				txtEmail,
																				GroupLayout.PREFERRED_SIZE,
																				399,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(191)
																		.addComponent(
																				btnCancelar)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnDelete,
																				GroupLayout.PREFERRED_SIZE,
																				84,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnGravar,
																				GroupLayout.PREFERRED_SIZE,
																				85,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																scrollPane,
																GroupLayout.PREFERRED_SIZE,
																449,
																GroupLayout.PREFERRED_SIZE))
										.addGap(1)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(33)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblId))
														.addComponent(
																txtId,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(6)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblNome))
														.addComponent(
																txtNome,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblGnero))
														.addComponent(
																cbxGenero,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(6)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblTelefone))
														.addComponent(
																txtTelefone,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(5)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblEndereo))
														.addComponent(
																txtEndereco,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(5)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblCidade))
														.addComponent(
																txtCidade,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(4)
																		.addComponent(
																				lblEstado))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				cbxEstado,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(6)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(3)
																		.addComponent(
																				lblEmail))
														.addComponent(
																txtEmail,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(6)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnGravar)
														.addComponent(btnDelete)
														.addComponent(
																btnCancelar))
										.addGap(6)
										.addComponent(scrollPane,
												GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)));
		setLayout(groupLayout);

		atualizaTabela();
		carregaEnumCbxEstado();
		carregaEnumCbxGenero();

	}

	protected void carregaContato(Cliente c) {
		txtId.setText(Integer.toString(c.getId()));
		txtNome.setText(c.getNome());
		txtTelefone.setText(c.getTelefone());
		txtEndereco.setText(c.getEndereco());
		txtCidade.setText(c.getCidade());
		cbxEstado.setSelectedItem(c.getEstado());
		txtEmail.setText(c.getEmail());
		cbxGenero.setSelectedItem(c.getGenero());

		contatoSelecionado = c;

	}

	private void atualizaTabela() {
		ConexaoPostgres con = new ConexaoPostgres();
		model.setLista((ArrayList<Cliente>) con.listaContatos());
		model.fireTableDataChanged();

		// atualiza o campo de id com o ultimo cliente + 1 para novo cadastro
		txtId.setText(Integer.toString(con.ultimoCliente + 1));

	}

	protected void gravarCliente() {
		if (contatoSelecionado == null) {
			Cliente c = new Cliente();
			c.setId(Integer.parseInt(txtId.getText().trim()));
			c.setNome(txtNome.getText().trim());
			c.setTelefone(txtTelefone.getText().trim());
			c.setEndereco(txtEndereco.getText().trim());
			c.setCidade(txtCidade.getText().trim());
			c.setEstado((Estado) cbxEstado.getSelectedItem());
			c.setEmail(txtEmail.getText().trim());
			c.setGenero((Genero) cbxGenero.getSelectedItem());
			
			ConexaoPostgres con = new ConexaoPostgres();
			con.cadastraCliente(c);
			atualizaTabela();
			cancelaTransacao();
		} else {
			contatoSelecionado.setNome(txtNome.getText().trim());
			contatoSelecionado.setTelefone(txtTelefone.getText().trim());
			contatoSelecionado.setEndereco(txtEndereco.getText().trim());
			contatoSelecionado.setCidade(txtCidade.getText().trim());
			contatoSelecionado.setEstado((Estado) (cbxEstado.getSelectedItem()));
			contatoSelecionado.setEmail(txtEmail.getText().trim());
			contatoSelecionado.setGenero((Genero) (cbxGenero.getSelectedItem()));
			ConexaoPostgres con = new ConexaoPostgres();
			con.updateCliente(contatoSelecionado);
			atualizaTabela();
			cancelaTransacao();
		}
	}
	private void cancelaTransacao() {
		// LImpas todos os compos do formulario
		txtId.setText(null);
		txtNome.setText(null);
		txtTelefone.setText(null);
		txtEndereco.setText(null);
		txtCidade.setText(null);
		cbxEstado.setSelectedItem(null);
		txtEmail.setText(null);
		cbxGenero.setSelectedItem(null);
		contatoSelecionado = null;
		atualizaTabela();

	}

	private void carregaEnumCbxGenero() {
		Genero[] vetGenero = Genero.values();
		ComboBoxModel cbx = new DefaultComboBoxModel(vetGenero);
		cbxGenero.setModel(cbx);

	}

	private void carregaEnumCbxEstado() {
		Estado[] vetEstado = Estado.values();
		ComboBoxModel cbx = new DefaultComboBoxModel(vetEstado);
		cbxEstado.setModel(cbx);

	}
}
