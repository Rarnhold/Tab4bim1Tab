package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelCadastroProduto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCusto;
	private JTextField txtMargemLucro;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PainelCadastroProduto() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		panel_1.add(lblId, gbc_lblId);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCdigoDeBarras = new JLabel("C\u00F3digo de Barras:");
		GridBagConstraints gbc_lblCdigoDeBarras = new GridBagConstraints();
		gbc_lblCdigoDeBarras.anchor = GridBagConstraints.EAST;
		gbc_lblCdigoDeBarras.insets = new Insets(0, 0, 5, 5);
		gbc_lblCdigoDeBarras.gridx = 2;
		gbc_lblCdigoDeBarras.gridy = 1;
		panel_1.add(lblCdigoDeBarras, gbc_lblCdigoDeBarras);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		GridBagConstraints gbc_lblDescrio = new GridBagConstraints();
		gbc_lblDescrio.anchor = GridBagConstraints.EAST;
		gbc_lblDescrio.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescrio.gridx = 0;
		gbc_lblDescrio.gridy = 2;
		panel_1.add(lblDescrio, gbc_lblDescrio);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Categoria:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox cbxCategoria = new JComboBox();
		GridBagConstraints gbc_cbxCategoria = new GridBagConstraints();
		gbc_cbxCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_cbxCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxCategoria.gridx = 1;
		gbc_cbxCategoria.gridy = 3;
		panel_1.add(cbxCategoria, gbc_cbxCategoria);
		
		JLabel lblEmbalagem = new JLabel("Embalagem:");
		GridBagConstraints gbc_lblEmbalagem = new GridBagConstraints();
		gbc_lblEmbalagem.anchor = GridBagConstraints.EAST;
		gbc_lblEmbalagem.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmbalagem.gridx = 2;
		gbc_lblEmbalagem.gridy = 3;
		panel_1.add(lblEmbalagem, gbc_lblEmbalagem);
		
		JComboBox cbxEmbalagem = new JComboBox();
		GridBagConstraints gbc_cbxEmbalagem = new GridBagConstraints();
		gbc_cbxEmbalagem.insets = new Insets(0, 0, 5, 0);
		gbc_cbxEmbalagem.gridwidth = 2;
		gbc_cbxEmbalagem.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxEmbalagem.gridx = 3;
		gbc_cbxEmbalagem.gridy = 3;
		panel_1.add(cbxEmbalagem, gbc_cbxEmbalagem);
		
		JLabel lblCusto = new JLabel("Custo:");
		GridBagConstraints gbc_lblCusto = new GridBagConstraints();
		gbc_lblCusto.anchor = GridBagConstraints.EAST;
		gbc_lblCusto.insets = new Insets(0, 0, 5, 5);
		gbc_lblCusto.gridx = 0;
		gbc_lblCusto.gridy = 4;
		panel_1.add(lblCusto, gbc_lblCusto);
		
		txtCusto = new JTextField();
		GridBagConstraints gbc_txtCusto = new GridBagConstraints();
		gbc_txtCusto.insets = new Insets(0, 0, 5, 5);
		gbc_txtCusto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCusto.gridx = 1;
		gbc_txtCusto.gridy = 4;
		panel_1.add(txtCusto, gbc_txtCusto);
		txtCusto.setColumns(10);
		
		JLabel lblMargemDeLucro = new JLabel("Margem de Lucro:");
		GridBagConstraints gbc_lblMargemDeLucro = new GridBagConstraints();
		gbc_lblMargemDeLucro.anchor = GridBagConstraints.EAST;
		gbc_lblMargemDeLucro.insets = new Insets(0, 0, 5, 5);
		gbc_lblMargemDeLucro.gridx = 2;
		gbc_lblMargemDeLucro.gridy = 4;
		panel_1.add(lblMargemDeLucro, gbc_lblMargemDeLucro);
		
		txtMargemLucro = new JTextField();
		GridBagConstraints gbc_txtMargemLucro = new GridBagConstraints();
		gbc_txtMargemLucro.insets = new Insets(0, 0, 5, 5);
		gbc_txtMargemLucro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMargemLucro.gridx = 3;
		gbc_txtMargemLucro.gridy = 4;
		panel_1.add(txtMargemLucro, gbc_txtMargemLucro);
		txtMargemLucro.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 5;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
