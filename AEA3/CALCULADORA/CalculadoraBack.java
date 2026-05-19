public class CalculadoraBack {
    private double acumulado;
    private double ultimoOperando;
    private String ultimaOperacion;
    private boolean esNuevoNumero;

    public CalculadoraBack() {
        reiniciar();
    }

    public void reiniciar() {
        acumulado = 0;
        ultimoOperando = 0;
        ultimaOperacion = "";
        esNuevoNumero = true;
    }

    public String procesarOperacion(double numeroActual, String operacion) {
        if (operacion.equals("=")) {
            if (!ultimaOperacion.isEmpty()) {
                acumulado = ejecutarCalculo(acumulado, ultimoOperando, ultimaOperacion);
            } else {
                acumulado = numeroActual;
            }
            return formatearNumero(acumulado);
        }

        if (ultimaOperacion.isEmpty() || esNuevoNumero) {
            acumulado = numeroActual;
        } else {
            ultimoOperando = numeroActual;
            acumulado = ejecutarCalculo(acumulado, ultimoOperando, ultimaOperacion);
        }

        ultimaOperacion = operacion;
        esNuevoNumero = true;
        return formatearNumero(acumulado);
    }

    private double ejecutarCalculo(double n1, double n2, String op) {
        switch (op) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": 
                if (n2 == 0) {
                    throw new ArithmeticException("Div0");
                }
                return n1 / n2;
            default: return n2;
        }
    }

    public void setEsNuevoNumero(boolean valor) {
        this.esNuevoNumero = valor;
    }

    private String formatearNumero(double valor) {
        if (valor == (long) valor) {
            return String.format("%d", (long) valor);
        }
        return String.valueOf(valor);
    }
}