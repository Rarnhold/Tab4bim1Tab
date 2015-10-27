package br.arnhold.cadastro.telaLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
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
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnNewMenu.add(mntmCliente);
		
		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mnNewMenu.add(mntmVendedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnNewMenu.add(mntmProduto);
		
		JMenu mnDigitao = new JMenu("Vendas");
		menuBar.add(mnDigitao);
		
		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mnDigitao.add(mntmVendas);
		
		JMenu mnNewMenu_1 = new JMenu("Relat\u00F3rio");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Venda Por Dia");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Venda Por M\u00EAs");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmVendaPorCategoria = new JMenuItem("Venda Por Categoria Produto");
		mnNewMenu_1.add(mntmVendaPorCategoria);
		
		JMenuItem mntmVendaPorCliente = new JMenuItem("Venda Por Cliente");
		mnNewMenu_1.add(mntmVendaPorCliente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
