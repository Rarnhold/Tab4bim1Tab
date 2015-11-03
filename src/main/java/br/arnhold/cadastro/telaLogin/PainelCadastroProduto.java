package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

public class PainelCadastroProduto extends JPanel {
	private JTextField txtID;
	private JTextField txtCodigoBarra;
	private JTextField txtDescricao;
	private JTextField txtPreco;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PainelCadastroProduto() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 70, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.gridx = 1;
		gbc_txtID.gridy = 1;
		add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo Barra:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtCodigoBarra = new JTextField();
		GridBagConstraints gbc_txtCodigoBarra = new GridBagConstraints();
		gbc_txtCodigoBarra.insets = new Insets(0, 0, 5, 0);
		gbc_txtCodigoBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigoBarra.gridx = 4;
		gbc_txtCodigoBarra.gridy = 1;
		add(txtCodigoBarra, gbc_txtCodigoBarra);
		txtCodigoBarra.setColumns(10);
		
		JLabel Descrição = new JLabel("Descri\u00E7\u00E3o:");
		GridBagConstraints gbc_Descrição = new GridBagConstraints();
		gbc_Descrição.anchor = GridBagConstraints.EAST;
		gbc_Descrição.insets = new Insets(0, 0, 5, 5);
		gbc_Descrição.gridx = 0;
		gbc_Descrição.gridy = 2;
		add(Descrição, gbc_Descrição);
		
		txtDescricao = new JTextField();
		GridBagConstraints gbc_txtDescricao = new GridBagConstraints();
		gbc_txtDescricao.gridwidth = 4;
		gbc_txtDescricao.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescricao.gridx = 1;
		gbc_txtDescricao.gridy = 2;
		add(txtDescricao, gbc_txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JComboBox cbxCategoria = new JComboBox();
		GridBagConstraints gbc_cbxCategoria = new GridBagConstraints();
		gbc_cbxCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_cbxCategoria.gridx = 1;
		gbc_cbxCategoria.gridy = 3;
		add(cbxCategoria, gbc_cbxCategoria);
		
		JLabel lblNewLabel_4 = new JLabel("Unidade:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 3;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox cbxUnidade = new JComboBox();
		GridBagConstraints gbc_cbxUnidade = new GridBagConstraints();
		gbc_cbxUnidade.insets = new Insets(0, 0, 5, 0);
		gbc_cbxUnidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxUnidade.gridx = 4;
		gbc_cbxUnidade.gridy = 3;
		add(cbxUnidade, gbc_cbxUnidade);
		
		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtPreco = new JTextField();
		GridBagConstraints gbc_txtPreco = new GridBagConstraints();
		gbc_txtPreco.insets = new Insets(0, 0, 5, 5);
		gbc_txtPreco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPreco.gridx = 1;
		gbc_txtPreco.gridy = 4;
		add(txtPreco, gbc_txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Margem Lucro");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 4;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.EAST;
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
		
		JButton btnDeletar = new JButton("Deletar");
		panel.add(btnDeletar);
		
		JButton btnGravar = new JButton("Gravar");
		panel.add(btnGravar);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 6;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		

	}

}
