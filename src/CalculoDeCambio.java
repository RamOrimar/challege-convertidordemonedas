import java.text.DecimalFormat;

public class CalculoDeCambio {
    double operacion;
    String bob = "Bolivianos";
    String clp = "Pesos Chilenos";
    String cop = "Pesos Colombianos";
    String brl = "Real Brasileño";
    String mxn = "Pesos mexicanos";
    String jpy = "Yenes japoneses";
    String gbp = "Libras esterlinas";

    String nombredeCambio;
    double valor;
    int way;
    DecimalFormat df = new DecimalFormat("#.00");

    public CalculoDeCambio(ObtenerValores matrisPaises, float cantidad, String nombre, int ruta) {
        valor = cantidad;
        way = ruta;

        if (nombre == bob) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.BOB();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.BOB();
            }
            nombredeCambio = "[BOB]";
        } else if (nombre == clp) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.CLP();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.CLP();
            }
            nombredeCambio = "[CLP]";
        } else if (nombre == cop) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.COP();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.COP();
            }
            nombredeCambio = "[COP]";
        } else if (nombre == brl) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.BRL();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.BRL();
            }
            nombredeCambio = "[BRL]";
        }
        else if (nombre == mxn) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.MXN();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.MXN();
            }
            nombredeCambio = "[MXN]";
        }else if (nombre == jpy) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.JPY();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.JPY();
            }
            nombredeCambio = "[JPY]";
        }else if (nombre == gbp) {
            if (ruta != 1) {
                operacion = cantidad / matrisPaises.GBP();
            } else if (ruta == 1) {
                operacion = cantidad * matrisPaises.GBP();
            }
            nombredeCambio = "[GBP]";
        }
    }

    @Override
    public String toString() {

        if (way != 1) {
            return "La cantidad de " + valor + " " + nombredeCambio +
                    " corresponde al valor de " + df.format(operacion) +
                    " [USD]";
        } else if (way == 1) {
            return "La cantidad de " + valor + " [USD]" +
                    " corresponde al valor de " + df.format(operacion) +
                    " " + nombredeCambio;
        }

        return "";
    }
}
