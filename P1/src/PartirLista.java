import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartirLista {
    public static void main(String[] args) throws Exception {
        List<String> lista1 = new ArrayList<String>();

        for (int i = 1; i <= 9; i++) {
            lista1.add(Integer.toString(i));
        }

        System.out.println(lista1);

        List<String> lista2 = new ArrayList<String>();
        List<String> lista3 = new ArrayList<String>();
        lista2 = lista1.subList(0, lista1.size() / 2);
        lista3 = lista1.subList(lista1.size() / 2, lista1.size());

        System.out.println(lista2);
        System.out.println(lista3);
    }
}