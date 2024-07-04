import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(Menus.menuPortada);
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    nombre = "Bolivianos";
                    //Bolivianos a Dolares
                    Menus.menuOpcion(nombre, 0);
                    break;
                case 2:
                    nombre = "Pesos Chilenos";
                    //Pesos Chilenos a Dolares
                    Menus.menuOpcion(nombre, 0);
                    break;
                case 3:
                    nombre = "Pesos Colombianos";
                    //Pesos colombianos a DOLARES
                    Menus.menuOpcion(nombre, 0);
                    break;
                case 4:
                    nombre = "Real Brasileño";
                    //Real Brasileño a DOLARES
                    Menus.menuOpcion(nombre, 0);
                    break;
                case 5:
                    System.out.println(Menus.menuDolar);
                    Scanner entrada2 = new Scanner(System.in);
                    new ConversionesDolares(entrada2);
                    break;
                case 6:
                    System.out.println(Menus.menuOtrasMonedas);
                    Scanner entrada3 = new Scanner(System.in);
                    new OtrasConversiones(entrada3);
                    break;

                default:
                    System.out.println("Gracias por usar la App de Convertidor");
            }
        }
    }
}
