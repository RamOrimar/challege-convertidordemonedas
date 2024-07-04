import java.util.Scanner;

public class OtrasConversiones {

    public OtrasConversiones(Scanner entrada3) {

        String nombre;
        int op=0;
        op= entrada3.nextInt();
        int ruta = 2;

        switch (op){
            case 1:
                nombre = "Pesos mexicanos";
                Menus.menuOpcion(nombre,ruta);
                break;
            case 2:
                nombre = "Yenes japoneses";
                Menus.menuOpcion(nombre,ruta);
                break;
            case 3:
                nombre = "Libras esterlinas";
                Menus.menuOpcion(nombre,ruta);
                break;
            case 4:
                return;
            default:

        }



    }
}

