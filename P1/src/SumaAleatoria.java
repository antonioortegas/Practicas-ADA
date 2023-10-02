import java.util.Random;
public class SumaAleatoria {
    public static void main(String[] args) {
        int sumandos = 20;
        if (args.length > 0) {
            sumandos = Integer.parseInt(args[0]);
        }
        Random random = new Random();
        double suma = 0;
        for (int i = 0; i < sumandos; i++) {
            suma += random.nextDouble();
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}

 