package P1;

public class MayorDe3 {
    public static void main(String[] args) throws Exception {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        if (n1 > n2 && n1 > n3) {
            System.out.print(n1);
        } else {
            if (n2 > n1 && n2 > n2) {
                System.out.print(n2);
            } else {
                System.out.print(n3);
            }
        }

        int res = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
        System.out.print(" " + res);

    }
}
