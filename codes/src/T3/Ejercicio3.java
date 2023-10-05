package T3;

public class Ejercicio3 {
    /*
    Sea un array A[] que contiene valores numéricos naturales todos distintos.
    Decimos que dos posiciones i, j (con i<j) forman una inversión si se cumple que
    A[i]>A[j]; es decir, si los elementos en las posiciones i y j no están
    relativamente ordenados de manera creciente entre sí.
    Deseamos obtener una función “int numInversiones (int[] A);” que devuelva el
    número total de inversiones del array. Por ejemplo, si A = {2,4,1,3,5}, entonces
    numInversiones(A) = 3 (correspondientes a las posiciones (0,2), (1,2) y (1,3)).
    Se pide:
    
    a. Diseñar un algoritmo para resolver el problema mediante un enfoque por
    fuerza bruta, e indicar su complejidad en términos del número de
    comparaciones entre elementos realizadas.
    
    b. Diseñar un algoritmo alternativo siguiendo un enfoque de Divide y
    Vencerás, de manera que sea más eficiente que el enfoque de fuerza
    bruta (Indicación: Si el alumno lo ve necesario para la resolución del
    problema, se podrán mezclar los elementos).
    
    c. Plantear una recurrencia para el coste computacional del algoritmo de
    Divide y Vencerás y determinar su orden de crecimiento mediante el
    Teorema Maestro.
     */
    public static void main(String[] args) {
        int[] vector = { 1, 2, 3, 5, 4, 0, 7, 8, 9 };
        System.out.println(contarInversionesFB(vector, 0, vector.length - 1));
        int inversiones = 0;
        System.out.println(contarInversionesDyV(vector, 0, vector.length - 1, (vector.length - 1) / 2, inversiones));
    }

    public static int contarInversionesFB(int[] vector, int menorIndice, int mayorIndice) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int contarInversionesDyV(int[] a, int inf, int sup, int medio, int inversiones) {
        int i = inf;
        int j = medio + 1;
        int[] b = new int[sup - inf + 1];
        int k = 0;
        while (i <= medio && j <= sup) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= medio) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= sup) {
            b[k] = a[j];
            j++;
            k++;
        }
        k = 0;
        for (int f = inf; f <= sup; f++) {
            a[f] = b[k];
            k++;
        }
    }

}
