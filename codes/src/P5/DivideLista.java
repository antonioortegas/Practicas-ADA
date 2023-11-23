import java.util.List;
import java.util.Arrays;


public class DivideLista {

	/**
	 *
	 * @param datos lista de entrada
	 * @param k     longitud de una de las listas soluci贸n
	 * @param a   lista soluci贸n 1 (salida)
	 * @param b   lista soluci贸n 2 (salida)
	 * @return  la diferencia entre las dos listas
	 *
	 */
	public static int resolverVoraz(int []datos, int k, List<Integer> a, List<Integer> b) {

		//******Completar la implementaci贸n*******

		int sol = 0;

		Arrays.sort(datos);

		if(k > datos.length/2){
			int lengthMenosK = datos.length-k;
			for(int i=datos.length-1; i>=0; i--){
				if(i<lengthMenosK){
					b.add(datos[i]);
				}else{
					a.add(datos[i]);
				}
			}
		}else{
			for(int i=0; i<datos.length; i++){
				if(i<k){
					b.add(datos[i]);
				}else{
					a.add(datos[i]);
				}
			}
		}

		sol = sum(a) - sum(b);
		if(sol<0){
			sol = sol *-1;
		}


		return sol;
	}


	private static int[] reverseL(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		return b;
	}


	private static int sum(List<Integer> l){
		int sum = 0;
		for(int i=0 ; i<l.size() ; i++){
			sum += l.get(i);
		}
		return sum;
	}
}