package P1;

public class BicicletaDeMontana extends Bicicleta {
    int tam;

    public BicicletaDeMontana(int tam, int frenos) {
        super(frenos);
        this.tam = tam;
    }

    public void establecerTamano(int t) {
        this.tam = t;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamano: " + tam;
    }
}
