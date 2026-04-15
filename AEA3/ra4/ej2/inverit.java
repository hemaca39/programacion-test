import java.io.*;
import java.util.Scanner;


public class inverit {

    public static void main(String[] args) {
        String fitxerEntrada = "entrada.txt";
        String fitxerSortida = "sortida.txt";

        invertirContingut(fitxerEntrada, fitxerSortida);
    }

    public static void invertirContingut(String rutaEntrada, String rutaSortida) {
        File arxiuEntrada = new File(rutaEntrada);

        if (!arxiuEntrada.exists()) {
            System.out.println("Error: El fitxer " + rutaEntrada + " no s'ha trobat.");
            return;
        }

        try (Scanner lector = new Scanner(arxiuEntrada);
             PrintWriter escriptor = new PrintWriter(new FileWriter(rutaSortida))) {

            while (lector.hasNextLine()) {
                String linia = lector.nextLine();
                
                String[] paraules = linia.split(" ");
                
                StringBuilder liniaInvertida = new StringBuilder();
                for (int i = paraules.length - 1; i >= 0; i--) {
                    liniaInvertida.append(paraules[i]);
                    if (i > 0) liniaInvertida.append(" "); 
                }

                escriptor.println(liniaInvertida.toString());
            }

            System.out.println("Procés finalitzat. Revisa " + rutaSortida);

        } catch (IOException e) {
            System.out.println("S'ha produït un error de lectura/escriptura: " + e.getMessage());
        }
    }
}