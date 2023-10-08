public class OrdenLogIter extends Metodo {
    public int codigo(int n) {
        int cont = 0;
        int i = 1;

        while (i < n) {
            i = i * 2;
            cont++;
        }

        return cont;
    }

}
