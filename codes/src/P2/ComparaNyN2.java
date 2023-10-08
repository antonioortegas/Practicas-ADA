public class ComparaNyN2 {

    public static void main(String[] args) {
        int[] tam = { 1, 5, 10, 50, 100, 500, 1000 };

        OrdenCuadradoIter ordenCuadradoIter = new OrdenCuadradoIter();
        OrdenCubicoIter ordenCubicoIter = new OrdenCubicoIter();

        long[] t1 = Complejidad.medirTiempos(ordenCuadradoIter, tam);
        long[] t2 = Complejidad.medirTiempos(ordenCubicoIter, tam);

        // Imprimir resultados
        System.out.println("Tiempos de ejecución (en nanosegundos)");
        for (int i = 0; i < tam.length; i++) {
            System.out.println(tam[i] + "\t" + t1[i] + "\t" + t2[i]);
        }
        //Comparar tiempos
        System.out.println("Comparación de tiempos");
        for (int i = 0; i < tam.length; i++) {
            double r = (double) t1[i] / t2[i];
            System.out.println(tam[i] + "\t" + r);
        }
    }

}
