package br.arnhold.cadastro.telaLogin;

import java.awt.BorderLayout;


//extende do Painel Abastrato com nome de AbstractPanel
public class TelaCadastroCliente extends AbstractPanel {
	

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		super();

	}

	@Override
	protected void configuraMiolo() {
		super.add(new PainelCadastroCliente(),BorderLayout.CENTER);
		
	}

}
