import java.util.Arrays;
import java.util.Scanner;

public class Examen2 {

    public static double[] notes = new double[50];
    public int NUM_NOTES = 0;
    public String MARCA_FI = "FI";
    private boolean fi = false;

    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();

    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici() {
        PreguntarNotes(); 
        ImprimirArrayNotes();
        
        Scanner sc = new Scanner(System.in);
        while (!fi) {
            MostrarMenu();
            String opcio = sc.nextLine().toUpperCase();
            
            if (opcio.equals(MARCA_FI)) {
                fi = true;
            } else {
                TractarOpcio(opcio);
            }
        }
    }

    private void PreguntarNotes() {
        double[] notasFijas = {1.0, 4.0, 7.0, 8.0, 0.0, 9.0, 10.0}; 
        for (int i = 0; i < notasFijas.length; i++) {
            notes[i] = notasFijas[i];
            NUM_NOTES++;
        }
    }

    private void ImprimirArrayNotes() {
        System.out.print("Larray de notes avaluat és: [ ");
        for (int i = 0; i < NUM_NOTES; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println("");
    }

    private void MostrarMenu() {
        System.out.println("\nBenvingu al calcul de notes de classe.");
        System.out.println("[MAX] Maxim | [MIN] Minim | [MIT] Mitjana | [FI] Sortir");
        System.out.print("Opció: ");
    }

    private void TractarOpcio(String opcio) {
        double resultat = 0;
        double[] copiaSolsNotes = Arrays.copyOfRange(notes, 0, NUM_NOTES);

        if (opcio.equals("MAX")) {
            resultat = calculador.calcularMaxim(copiaSolsNotes);
            ImprimirResultat(resultat, PrepararSortida(resultat), "MAX");
        } else if (opcio.equals("MIN")) {
            resultat = calculador.calcularMinim(copiaSolsNotes);
            ImprimirResultat(resultat, PrepararSortida(resultat), "MIN");
        } else if (opcio.equals("MIT")) {
            resultat = calculador.calcularMitjana(copiaSolsNotes, NUM_NOTES);
            ImprimirResultat(resultat, PrepararSortida(resultat), "MIT");
        }
    }

    private String PrepararSortida(double valor) {
        return transformar.notaAText(valor);
    }

    private void ImprimirResultat(double valornota, String text, String opcio) {
        System.out.println("El valor de l'opció " + opcio + " és " + valornota + " (" + text + ")");
    }
}
//la opcion del 8 no la he puesto
//lo que no he utilizado lo he eliminado
//las notas son las que estan en el Pdf de ejem