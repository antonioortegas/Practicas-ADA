import java.util.List;

public class ProcesaLista extends Metodo {
	private List<Integer> lista;

	public ProcesaLista() {
		super();
		lista = null;

	}

	public void setLista(List<Integer> l) {
		lista = l;
	}

	public List<Integer> getLista() {
		return lista;
	}

	/**
	 * Procesamos todos los elementos de la lista lista.
	 * return El número de elementos procesados en realidad.
	 */
	@Override
	public int codigo(int n) {
		procesaLista(lista);
		return n > lista.size() ? n : lista.size();
	}

	private void procesaLista(List<Integer> lista) {
		//Completar la implementación del método
		for (int i = 0; i < lista.size() - 1; i++) {
			if (i > 0 && lista.get(i) == lista.get(i - 1)) {
				lista.remove(i);
				i--;
			}
		}
	}

}
