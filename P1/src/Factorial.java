public class Factorial {
    public static void main(String[] args) throws Exception {
        int factorial = 1;
        int number = Integer.parseInt(args[0]);

        if(number < 0){
            factorial = -1;
        }
        for(int i = 1 ; i <= number ; i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
