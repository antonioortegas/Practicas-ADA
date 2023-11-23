import java.util.List;

public class Antenas {

	private Integer[] puntosKm; //Puntos kilometricos de las urbanizaciones ordenados crecientemente.
	private int cobertura;

	public Antenas(Integer[] urbanizaciones, int c) {
		puntosKm = urbanizaciones;
		cobertura=c;

	}

	public List<Integer> situarAntenas(){

		List<Integer> sol = new java.util.ArrayList<Integer>();
		int range = -1;

		for(int i = 0; i<puntosKm.length; i++){
			if(puntosKm[i] > range){
				range = puntosKm[i] + 2*cobertura;
				sol.add(puntosKm[i] + cobertura);
			}
		}


		return sol;
	}


}