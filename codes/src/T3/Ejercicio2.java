package T3;

public class Ejercicio2 {
    /*
     Dado un vector V de enteros todos distintos y un número entero S. Diseñar un
     algoritmo que en tiempo O(n lg n) determine si existen o no dos elementos de V
     tales que su suma sea S
     */
    public static void main(String[] args) {
        int[] vector = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int suma = 15;
        System.out.println(buscarSuma(vector, 0, vector.length - 1, suma));
    }

    public static String buscarSuma(int[] vector, int menorIndice, int mayorIndice, int sumaBuscada) {
        int sumaElementos = vector[menorIndice] + vector[mayorIndice];
        if (sumaElementos == sumaBuscada) {
            return "La suma de los elementos numero " + (menorIndice + 1) + "(" + vector[menorIndice] + ") y "
                    + (mayorIndice + 1) + "(" + vector[mayorIndice] + ") es igual a "
                    + sumaBuscada;
        }
        if (sumaElementos < sumaBuscada) {
            menorIndice++;
            return buscarSuma(vector, menorIndice, mayorIndice, sumaBuscada);
        }
        if (sumaElementos < sumaBuscada) {
            mayorIndice--;
            return buscarSuma(vector, menorIndice, mayorIndice, sumaBuscada);
        }
        return "no";
    }
}
