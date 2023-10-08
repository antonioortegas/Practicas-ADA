public class DosCasos extends Metodo {

    public int codigo(int n) {
        int cont = 0;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 0; i < n; i++) {
                cont++;
            }
        }
        return cont;
    }
}
