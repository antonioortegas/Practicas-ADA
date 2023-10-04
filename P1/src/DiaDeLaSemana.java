public class DiaDeLaSemana {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        String dia = "";
        switch (n) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
        }
        System.out.println(dia);

    }
}
