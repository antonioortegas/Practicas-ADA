import java.util.Set;

public class Cobertura {

	private Grafo grafo;

	public Cobertura(Grafo g) {
		grafo = g;
	}

	public Set<Integer> getConjuntoCobertura() {

		//**** Completar la implementación del método*****************

		Set<Integer> nodos = grafo.nodos();

		Set<Integer> sol = new java.util.HashSet<Integer>();

/*
 	for (Integer nodo : grafo.nodos()) {
			if (grafo.grado(nodo) == 0) {
				nodos.remove(nodo);
			}
		}
 */
		while(grafo.numAristas()>0){

			int max = -1;
			int nodoMax = 0;
			for (Integer nodo : grafo.nodos()) {
				if (grafo.grado(nodo) > max) {
					max = grafo.grado(nodo);
					nodoMax = nodo;
				}
			}

			sol.add(nodoMax);
			nodos.remove(nodoMax);
			for (Integer nodo : grafo.sucesores(nodoMax)) {
				grafo.removeArista(nodoMax, nodo);
			}

		}

		return sol;
	}

}