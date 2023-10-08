public class OrdenNLogIter extends Metodo {
    public int codigo(int n) {
        int cont = 0;
        int i = 0;
        int j = 1;

        for (i = 0; i < n; i++) {
            while (j < n) {
                j = j * 2;
                cont++;
            }
        }

        return cont;
    }
}