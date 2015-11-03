package br.arnhold.cadastro.telaLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					//inicia a tela maximizada
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbrirCliente();
			}
		});
		mnCadastro.add(mntmCliente);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbrirUsuario();
			}
		});
		mnCadastro.add(mntmUsuario);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbrirProduto();
			}
		});
		mnCadastro.add(mntmProduto);
		JPanel jPanel = new JPanel();
		contentPane = jPanel;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}

	protected void AbrirProduto() {
		final TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
		
		ActionListener act =  new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroProduto);
			}	
		};
		tabbedPane.add("Tela de Produto",telaCadastroProduto);
		
	}

	protected void AbrirUsuario() {
		final TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
		
		ActionListener act = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tabbedPane.remove(telaCadastroUsuario);
			}
		};
		//chamada da tela
		tabbedPane.addTab("Cadastro de Usuario", telaCadastroUsuario);
	}

	protected void AbrirCliente() {
		final TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		
		ActionListener act = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroCliente);
			}
		};
		tabbedPane.addTab("Cadastro de Cliente", telaCadastroCliente);
	}

}
