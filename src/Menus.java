import java.util.Scanner;

public class Menus {
    static String menuPortada = """
            *************************************
            CONVERSOR DE MONEDA V. 2.0.1
            Bienvenido a la app de conversion. Escoja una opcion:
            1.-Bolivianos a Dolares
            2.-Peso chileno a Dolares
            3.-Peso colombiano a Dolares
            4.-Real Brasileño a Dolares
            5.-Conversiones de Dolares
            6.-Otras Conversiones
            7.-Salir
            *************************************""";
    static String menuDolar = """
            *************************************
            Conversiones de Dolares
            1.-Bolivianos               
            2.-Peso chileno
            3.-Peso colombiano
            4.-Real Brasileño
            5.-Otras Conversiones
            6.-Regresar
            7.-Salir
            *************************************""";
    static String menuOtrasMonedas = """
            *************************************
            Otros cambios de moneda a Dolares
            1.-Pesos Mexicanos
            2.-Yen Japones
            3.-Libra Esterlina
            4.-Salir
            *************************************""";





    static void menuOpcion (String nombre,int ruta){
        if(ruta != 1){
            System.out.println("Conversion de "+nombre+" a Dolares");
        }else if (ruta==1){
            System.out.println("Conversion de Dolares a " +nombre );
        }
        Scanner lectura = new Scanner(System.in);
        ConsultadeAPI consulta = new ConsultadeAPI();
        System.out.println("Colocar el valor que desea convertir:");
        var cantidad = Float.valueOf(lectura.nextLine());
        CalculoDeCambio divisa = consulta.obtenernjson(cantidad,nombre,ruta);
        System.out.println(divisa);
    }

}
