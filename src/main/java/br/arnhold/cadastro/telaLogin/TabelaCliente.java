package br.arnhold.cadastro.telaLogin;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.arnhold.cadastro.model.Cliente;

public class TabelaCliente extends AbstractTableModel {

	private ArrayList<Cliente> lista = new ArrayList<Cliente>();

	

	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = (ArrayList<Cliente>) lista;
		this.fireTableDataChanged();//atualiza modelo
	}

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	public Object getValueAt(int linha, int coluna) {
		Cliente c = lista.get(linha);
		switch (coluna) {
		case 0 : return c.getId();
		case 1 : return c.getNome();
		case 2 : return c.getTelefone();
		case 3 : return c.getEndereco();
		case 4 : return c.getCidade();
		case 5 : return c.getEstado();
		case 6 : return c.getEmail();
		case 7 : return c.getGenero();
		default:
			break;
		}		
		return null;
	}

	@Override
	public String getColumnName(int coluna) {
		switch (coluna) {
		case 0 : return "Código";
		case 1 : return "Nome";
		case 2 : return "Telefone";
		case 3 : return "Endereco";
		case 4 : return "Cidade";
		case 5 : return "Estado";
		case 6 : return "Email";
		case 7 : return "Genero";
		default:
			break;
		}
		return super.getColumnName(coluna);
	}
	
	public void addCLiente(Cliente c){
		lista.add(c);
		super.fireTableDataChanged();
	}
	
	
}
