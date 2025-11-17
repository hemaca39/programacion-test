import java.util.Scanner;

public class Encuesta {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] valoracion = new int[20];
        int suma = 0;
        int cinco = 0;
        int menos3 = 0;

        System.out.println("introduce el valors delos 20 clientes (1-5)");
        
        for (int i = 0; i < valoracion.length; i++) {
            System.out.print("Client " + (i + 1) + ": ");
            int valor = s.nextInt();

            if (valor < 1 || valor > 5) {
                System.out.println("no valido, ha de ser entre 1 i 5.");
                i--; 
                
            }

            valoracion[i] = valor;
            suma += valor;

            if (valor == 5) {
                cinco++;
            }
            if (valor < 3) {
                menos3++;
            }
        }

        double promedio = (double) suma / valoracion.length;
        System.out.println("resultados");
        System.out.println("media" + promedio);
        System.out.println("clients que van posar 5 " + cinco);
        System.out.println("clients que van posar menys de 3 " + menos3);
    }
}
