import java.util.Scanner;

public class ej1r {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcio = "";

        while (!opcio.equalsIgnoreCase("FI")) {
            System.out.println("De quina figura vols calcular l'area?");
            System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
            System.out.println("Per acabar el programa: FI");
            
            opcio = sc.nextLine().toLowerCase();

            if (opcio.equals("fi")) {
                break;
            }

            switch (opcio) {
                case "quadrat":
                    System.out.println("Quin es el costat del quadrat?");
                    double costat = sc.nextDouble();
                    imprimirResultat(Calculs.areaQuadrat(costat));
                    break;

                case "cercle":
                    System.out.println("Quin es el radi del cercle?");
                    double radi = sc.nextDouble();
                    imprimirResultat(Calculs.areaCercle(radi));
                    break;

                case "triangle":
                    System.out.println("Quina es la base?");
                    double b = sc.nextDouble();
                    System.out.println("Quina es la altura?");
                    double h = sc.nextDouble();
                    imprimirResultat(Calculs.areaTriangle(b, h));
                    break;

                case "rectangle":
                    System.out.println("Costat 1:");
                    double c1 = sc.nextDouble();
                    System.out.println("Costat 2:");
                    double c2 = sc.nextDouble();
                    imprimirResultat(Calculs.areaRectangle(c1, c2));
                    break;

                case "trapezi":
                    System.out.println("Base major (a):");
                    double a = sc.nextDouble();
                    System.out.println("Base menor (b):");
                    double b_trap = sc.nextDouble();
                    System.out.println("Altura (h):");
                    double h_trap = sc.nextDouble();
                    imprimirResultat(Calculs.areaTrapezi(a, b_trap, h_trap));
                    break;

                case "rombe":
                    System.out.println("Diagonal Major:");
                    double dM = sc.nextDouble();
                    System.out.println("Diagonal menor:");
                    double dm = sc.nextDouble();
                    imprimirResultat(Calculs.areaRombe(dM, dm));
                    break;

                case "paralelogram":
                    System.out.println("Base:");
                    double bp = sc.nextDouble();
                    System.out.println("Altura:");
                    double hp = sc.nextDouble();
                    imprimirResultat(Calculs.areaParalelogram(bp, hp));
                    break;

                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
            sc.nextLine(); 
        sc.close();
    }
    public static void imprimirResultat(double area) {
        System.out.println("L area de tu figura es " + area);
    }
}