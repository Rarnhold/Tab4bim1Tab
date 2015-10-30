package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.arnhold.cadastro.model.Cliente;
import br.arnhold.cadastro.model.ClienteDaoPostgres;
import br.arnhold.cadastro.model.Estado;
import br.arnhold.cadastro.model.Genero;

import javax.swing.JButton;

import org.eclipse.jdt.internal.compiler.ast.Clinit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
	//chamada da tela de impressão inferior da tela de cadastro
	private TabelaCliente model = new TabelaCliente();
	
	// verifica se existe contato selecionado
	private Cliente contatoSelecionado;
	
	private TabelaCliente tabelaCliente = new TabelaCliente();
	
	
	private JButton btnGravar;

	/**
	 * Create the panel.
	 */
	public PainelCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		
		
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.fill = GridBagConstraints.BOTH;
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 1;
		add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 3;
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.anchor = GridBagConstraints.NORTH;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 2;
		add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.gridwidth = 3;
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 3;
		add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		lblEndereo = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 4;
		add(lblEndereo, gbc_lblEndereo);
		
		txtEndereco = new JTextField();
		GridBagConstraints gbc_txtEndereco = new GridBagConstraints();
		gbc_txtEndereco.gridwidth = 3;
		gbc_txtEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_txtEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndereco.gridx = 1;
		gbc_txtEndereco.gridy = 4;
		add(txtEndereco, gbc_txtEndereco);
		txtEndereco.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.anchor = GridBagConstraints.EAST;
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 5;
		add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 5;
		add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.gridx = 2;
		gbc_lblEstado.gridy = 5;
		add(lblEstado, gbc_lblEstado);
		
		cbxEstado = new JComboBox();
		GridBagConstraints gbc_cbxEstado = new GridBagConstraints();
		gbc_cbxEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxEstado.insets = new Insets(0, 0, 5, 0);
		gbc_cbxEstado.gridx = 3;
		gbc_cbxEstado.gridy = 5;
		add(cbxEstado, gbc_cbxEstado);
		
		lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 6;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 3;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.anchor = GridBagConstraints.NORTH;
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 6;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblGnero = new JLabel("G\u00EAnero");
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.anchor = GridBagConstraints.EAST;
		gbc_lblGnero.gridx = 0;
		gbc_lblGnero.gridy = 7;
		add(lblGnero, gbc_lblGnero);
		
		cbxGenero = new JComboBox();
		GridBagConstraints gbc_cbxGenero = new GridBagConstraints();
		gbc_cbxGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxGenero.insets = new Insets(0, 0, 10, 5);
		gbc_cbxGenero.gridx = 1;
		gbc_cbxGenero.gridy = 7;
		add(cbxGenero, gbc_cbxGenero);
		
		btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalvaCliente();
			}
		});
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.gridx = 3;
		gbc_btnGravar.gridy = 7;
		add(btnGravar, gbc_btnGravar);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 8;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);

		carregaEnumCbxEstado();
		carregaEnumCbxGenero();
		
		
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

	protected void SalvaCliente() {
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
			
			
			//grava no banco
			/*
			 * ClienteDaoPostgres dao = new ClienteDaoPostgres();
				dao.inserir(c);
			*/
			//Grava na tabela
			model.addCLiente(c);
			
			
			
		}
		
	}


	

}
