package br.arnhold.cadastro.telaLogin;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

//Insere o abstract para que possa reutilizar a tela em outras telas
public abstract class AbstractPanel extends JPanel {
	
	
	//instancia o método abstrado desta forma quem for utilizar deverá implementar para a utilização.
	protected abstract void configuraMiolo();
	

	/**
	 * Create the panel.
	 */
	public AbstractPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Superior = new JPanel();
		panel_Superior.setBackground(Color.GRAY);
		add(panel_Superior, BorderLayout.NORTH);
		GridBagLayout gbl_panel_Superior = new GridBagLayout();
		gbl_panel_Superior.columnWidths = new int[]{199, 51, 0};
		gbl_panel_Superior.rowHeights = new int[]{23, 0};
		gbl_panel_Superior.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Superior.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_Superior.setLayout(gbl_panel_Superior);
		
		JButton btnSair = new JButton("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 1;
		gbc_btnSair.gridy = 0;
		panel_Superior.add(btnSair, gbc_btnSair);
		
		JPanel panel_Inferior = new JPanel();
		panel_Inferior.setBackground(Color.GRAY);
		add(panel_Inferior, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_Inferior = new GridBagLayout();
		gbl_panel_Inferior.columnWidths = new int[]{192, 65, 0};
		gbl_panel_Inferior.rowHeights = new int[]{23, 0};
		gbl_panel_Inferior.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Inferior.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_Inferior.setLayout(gbl_panel_Inferior);
		
		JButton btnGravar = new JButton("Gravar");
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnGravar.gridx = 1;
		gbc_btnGravar.gridy = 0;
		panel_Inferior.add(btnGravar, gbc_btnGravar);

		//Tem que existir a chamada do método
		configuraMiolo();
		
	}

}
