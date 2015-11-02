package br.arnhold.cadastro.telaLogin;

import java.awt.BorderLayout;

public class TelaCadastroUsuario extends AbstractPanel {

	public TelaCadastroUsuario(){
		super();
	}
	
	@Override
	protected void configuraMiolo() {
		super.add(new PainelCadastroUsuario(),BorderLayout.CENTER);
		
	}

}
