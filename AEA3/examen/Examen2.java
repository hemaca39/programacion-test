package UF2.Examen_v2;

import java.util.Scanner;

public class Examen2 {

    public static double[] notes = new double[50];
    public int MARCA_NOTES = -1;
    public int NUM_NOTES = 0;
    public String MARCA_FI = "fi";
    private boolean fi = false;
    public double max = 0;
    public double min = 10;
    public double mitj = 0;


    private final CalculArrays calculador = new CalculArrays();
    private final CercaDicotomica cerca = new CercaDicotomica();
    private final NotaAText transformar = new NotaAText();


    public static void main(String[] args) {
        Examen2 programa = new Examen2();
        programa.inici();
    }

    public void inici(){
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:no en té
    //Param. sort:no en té
    //FUNCIÓ: llegir les notes
    private void PreguntarNotes() {
        //OPCIÓ 1 --> Les dades les definim DIRECTAMENT al programa
        //Desenvolupeu el vostre codi aquí


        // -----------------------

        //OPCIÓ 2 --> PUNTUACIÓ EXTRA (1p+). Agafem les dades de terminal
        //Comenceu per l'opció 1!!
        //System.out.println("\nAbans de començar, escriu tantes notes ENTERES com vulguis.");
        //System.out.println("\nQuan hagis acabat d'escriure les notes, escriu un -1.");
        //System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir l'array de les notes just després que les haguem llegit
    private void ImprimirArrayNotes() {
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    private void MostrarMenu() {
        System.out.println("\nBenvinguda al càlcul de notes de classe.");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[MAX] Saber la nota màxima de classe");
        System.out.println("[MIN] Saber la nota mínima de classe");
        System.out.println("[MIT] Saber la nota mitjana de classe");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: tractar cadascuna de les opcions que l'usuari pot triar
    private void TractarOpcio() {
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr: la nota que volem transformar en text
    //Param. sort: la nota JA transformada en text i si modificar la variable per saber si algú ha tret un 8.
    //FUNCIÓ: Cridem la funció que ens transforma en text la notra nota.
    private String PrepararSortida(double valor) {
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: buscar si algú ha tret un 8 utilitzant una funció ja creada
    private boolean MirarSiAlgu8() {
        //Desenvolupeu el vostre codi aquí
    }

    //Param. entr:
    //Param. sort:
    //FUNCIÓ: imprimir el resultat de l'opció que l'usuari ha triat.
    private void ImprimirResultat(double valornota, String text, String opcio) {
        String opcioescollida = "";
        if (opcio.equalsIgnoreCase("MAX")){
            opcioescollida = "màxim";
        }
        else if (opcio.equalsIgnoreCase("MIN")){
            opcioescollida = "mínim";
        }
        else {
            opcioescollida = "mitjà";
        }
        System.out.print("El valor " + opcioescollida +" de l'array que has escrit és " + valornota);
        System.out.println(" que equival a un " + text + ".\n");
    }

}
