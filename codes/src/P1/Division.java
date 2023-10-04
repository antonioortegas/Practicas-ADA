package P1;

public class Division {
    public static void main(String[] args) throws Exception {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        try {
            System.out.println(n1 / n2);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
