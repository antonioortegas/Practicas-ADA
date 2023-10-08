public class OrdenLinealRec extends Metodo {
    public int codigo(int n) {
        if (n > 0) {
            codigo(n - 1);
        }
        return 0;
    }
}
