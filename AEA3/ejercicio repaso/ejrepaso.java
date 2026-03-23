import java.util.Scanner;

public class PrediccioPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pantalla inicial
        System.out.println("Escriu el mes en què vas nèixer.");
        System.out.println("Gener  Febrer  Marc");
        System.out.println("Abril  Maig    Juny");
        System.out.println("Juliol Agost   Setembre");
        System.out.println("Octubre Novembre    Desembre\n");
        
        String mes = sc.nextLine();

        System.out.println("Com et dius?");
        String nom = sc.nextLine();

        System.out.println("Per acabar, quants anys tens?");
        int edat = sc.nextInt();

        System.out.println("\n-------------------------------------------");
        System.out.println("Un plaer coneixer-te " + nom + ". Amb les dades que m'has donat, mira que he arribat a saber de tu...");
        
        System.out.println("\n>>> El teu numero de la sort es el " + calcularNumeroSort(edat) + "!");
        System.out.println(">>> El teu equip de futbol preferit... es el " + obtenirEquip(mes) + ".");
        System.out.println(">>> El teu llenguatge de programacio mes estimat sera " + obtenirLlenguatge(mes) + "!");
        
        System.out.println("\nTorna quan vulguis!");
        System.out.println("-------------------------------------------");
        
        sc.close();
    }


    public static double calcularNumeroSort(int edat) {
        return (double) edat + 1; 
    }

    
    public static String obtenirEquip(String mes) {
        String resultat;
        switch (mes.toLowerCase()) {
            case "gener":
                resultat = "Bayern de Munich";
                break;
            case "febrer":
                resultat = "Real Madrid";
                break;
            case "marc":
                resultat = "FC Barcelona";
                break;
            case "abril":
                resultat = "Manchester City";
                break;
            default:
                resultat = "un equip desconegut";
                break;
        }
        return resultat;
    }

    public static String obtenirLlenguatge(String mes) {
        String llenguatge;
        switch (mes.toLowerCase()) {
            case "gener":
                llenguatge = "C++";
                break;
            case "febrer":
                llenguatge = "Java";
                break;
            case "marc":
                llenguatge = "Python";
                break;
            case "abril":
                llenguatge = "JavaScript";
                break;
            default:
                llenguatge = "Assembler";
                break;
        }
        return llenguatge;
    }
}