package br.arnhold.cadastro.telaLogin;

import java.awt.BorderLayout;

public class TelaCadastroProduto extends AbstractPanel {

	public TelaCadastroProduto() {
		super();
		
	}
	
	@Override
	protected void configuraMiolo() {
		super.add(new PainelCadastroProduto(),BorderLayout.CENTER);
		
	}

}
