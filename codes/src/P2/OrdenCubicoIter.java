public class OrdenCubicoIter extends Metodo {
    public int codigo(int n) {
        int cont = 0;
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    cont++;
                }
            }
        }

        return cont;
    }
}
