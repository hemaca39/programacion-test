
import java.util.Scanner;

public class ejnew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("de que figura quieres calcular el area? ");
        System.out.print("Escribe una figura (triangulo, circulo, trapecio, rombo, paralelogramo): ");
        System.out.print("para acabar el programa pon fin ");
        String figura = sc.nextLine();

        switch (figura) {

            case "triangulo":
                System.out.print("Introduce la base: ");
                double baseT = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double alturaT = sc.nextDouble();
                System.out.println("Área del triángulo: " + areaTriangulo(baseT, alturaT));
                break;

            case "circulo":
                System.out.print("Introduce el radio: ");
                double radio = sc.nextDouble();
                System.out.println("Área del círculo: " + areaCirculo(radio));
                break;

            case "trapecio":
                System.out.print("Introduce la base mayor: ");
                double baseMayor = sc.nextDouble();
                System.out.print("Introduce la base menor: ");
                double baseMenor = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double alturaTrap = sc.nextDouble();
                System.out.println("Área del trapecio: " + areaTrapecio(baseMayor, baseMenor, alturaTrap));
                break;

            case "rombo":
                System.out.print("Introduce la diagonal mayor: ");
                double diagMayor = sc.nextDouble();
                System.out.print("Introduce la diagonal menor: ");
                double diagMenor = sc.nextDouble();
                System.out.println("Área del rombo: " + areaRombo(diagMayor, diagMenor));
                break;

            case "paralelogramo":
                System.out.print("Introduce la base: ");
                double baseP = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double alturaP = sc.nextDouble();
                System.out.println("Área del paralelogramo: " + areaParalelogramo(baseP, alturaP));
                break;

            default:
                System.out.println("Figura no válida");
        }
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaTrapecio(double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) * altura / 2;
    }

    public static double areaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public static double areaParalelogramo(double base, double altura) {
        return base * altura;
    }
}