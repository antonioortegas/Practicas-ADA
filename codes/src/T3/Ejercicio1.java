package T3;

public class Ejercicio1 {

    /*
    Dado un vector ordenado V de n enteros distintos, escribir un algoritmo que en
    tiempo O(lg n) encuentre un número i tal que 1≤i≤n y V[i] = i, siempre que
    exista.
    */
    public static void main(String[] args) {
        int[] vector = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int num = 6;
        System.out.println(buscar(vector, 0, vector.length - 1, num));
    }

    public static int buscar(int[] vector, int menorIndice, int mayorIndice, int num) {
        if (menorIndice > mayorIndice) {
            return -1;
        }
        int puntoMedio = (menorIndice + mayorIndice) / 2;
        if (vector[puntoMedio] == num) {
            return puntoMedio;
        } else if (vector[puntoMedio] < num) {
            return buscar(vector, puntoMedio + 1, mayorIndice, num);
        } else {
            return buscar(vector, menorIndice, puntoMedio - 1, num);
        }
    }
}
