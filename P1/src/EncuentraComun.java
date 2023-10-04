import java.util.*;

public class EncuentraComun {
    public static void main(String[] args) throws Exception {
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();

        for (int i = 1; i <= 5; i++) {
            lista1.add(Integer.toString(i));
        }
        for (int i = 1; i <= 5; i++) {
            lista2.add(Integer.toString(i + 2));
        }

        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println("Elementos comunes : \n");

        for (String string : lista1) {
            for (String string2 : lista2) {
                if (string.equals(string2)) {
                    System.out.print(string + " ");
                }
            }
        }

    }
}
