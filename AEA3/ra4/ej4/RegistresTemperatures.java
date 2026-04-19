public class RegistresTemperatures {

    public static void main(String[] args) {
        double[] temperatures = new double[10];

        try {
            System.out.println("iiciant el registre de temperatures");

            for (int i = 0; i <= temperatures.length; i++) {
                temperatures[i] = 20.0 + i;
                System.out.println("registrada temperatura " + (i + 1) + ": " + temperatures[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("error: S'ha intentat accedir una posició de l'array que no existeix.");
            System.err.println("detall de l'error: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("s'ha produït un error inesperat: " + e.getMessage());

        } finally {
            System.out.println("finalitzant el programa de registre.");
        }
    }
}