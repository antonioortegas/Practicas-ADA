import java.util.ArrayList;
import java.util.List;

public class TestBicicleta {
    public static void main(String[] args) throws Exception {
        List<Bicicleta> lista = new ArrayList<Bicicleta>();
        lista.add(new Bicicleta(5));  
        lista.add(new Bicicleta(10));  
        lista.add(new BicicletaDeMontana(10, 6));  
        lista.add(new BicicletaDeMontana(10, 7));
        for (Bicicleta bicicleta : lista) {
            System.out.print(bicicleta.toString() + "\n");
        }
    }
}
