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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCadastroUsuario extends JPanel {
	private JTextField txtIdUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
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
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(232)
					.addComponent(btnCancelar)
					.addGap(4)
					.addComponent(btnNewButton)
					.addGap(4)
					.addComponent(btnGravar))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblId)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtIdUsuario, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addComponent(lblCliente)
							.addGap(25)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
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
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancelar)
						.addComponent(btnNewButton)
						.addComponent(btnGravar))
					.addGap(4)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(1))
		);
		panel.setLayout(gl_panel);

	}
}
