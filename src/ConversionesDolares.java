import java.util.Scanner;

public class ConversionesDolares {

    public ConversionesDolares(Scanner entrada2) {
        String nombre2;
        int op=0;
        op= entrada2.nextInt();
        int ruta = 1;

        switch (op){
            case 1:
                nombre2 = "Bolivianos";
                //Dolares a Bolivianos
                Menus.menuOpcion(nombre2,ruta);
                break;
                case 2:
                nombre2 = "Pesos Chilenos";
                //Dolares a Bolivianos
                Menus.menuOpcion(nombre2,ruta);
                break;
                case 3:
                nombre2 = "Pesos Colombianos";
                //Dolares a Bolivianos
                Menus.menuOpcion(nombre2,ruta);
                break;
                case 4:
                nombre2 = "Real Brasileño";
                //Dolares a Bolivianos
                Menus.menuOpcion(nombre2,ruta);
                break;
            case 6:
                return;
            default:

        }

    }
}
