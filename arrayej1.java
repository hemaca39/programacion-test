import java.util.Scanner;

public class arrayej1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] temps = new double[7];
                double suma = 0;
        double max = temps[0];
        double min = temps[0];
        int diamax = 0;
        int diamin = 0;
        System.out.println("introduce las temperatures maximas de los 7 dias:");

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Dia " + (i + 1));
            temps[i] = s.nextDouble();
        }
            
        for (int i = 0; i < temps.length; i++) {
            suma += temps[i];

            if (temps[i] > max) {
                max = temps[i];
                diamax = i;
            }

            if (temps[i] < min) {
                min = temps[i];
                diamin = i;
            }
        }
        double media = suma / temps.length;
        System.out.println("temperatura max: " + max + " (Dia " + (diamax + 1) + ")");
        System.out.println("temperatura min: " + min + " (Dia " + (diamin + 1) + ")");
        System.out.println(" resultado media");
        System.out.println("media: " + media);
    }
}
