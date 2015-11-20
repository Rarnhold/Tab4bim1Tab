package br.arnhold.cadastro.telaLogin;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.arnhold.cadastro.model.Usuario;

public class TabelaUsuario extends AbstractTableModel {

	private ArrayList<Usuario> lista = new ArrayList<Usuario>();

	public ArrayList<Usuario> getLista() {
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = (ArrayList<Usuario>) lista;
		this.fireTableDataChanged();// atualiza modelo
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
		Usuario u = lista.get(linha);
		switch (coluna) {
		case 0: return u.getIdCliente();
		case 1: return u.getId();
		case 2:	return u.getSenha();
		default:
			break;
		}
		return null;
	}

	@Override
	public String getColumnName(int coluna) {
		switch (coluna) {
		case 0:
			return "Código Cliente";
		case 1:
			return "Código Usuario";
		case 2:
			return "Senha Usuario";
		default:
			break;
		}
		return super.getColumnName(coluna);
	}

	public void addUsuario(Usuario u) {
		lista.add(u);
		super.fireTableDataChanged();
	}

}
