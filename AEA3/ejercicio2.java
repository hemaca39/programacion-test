import java.util.Scanner;
public class ejercicio2 {
     public static void main (String[] args) {
    EJ2 programa = new EJ2();
    programa.inici();
  }
  public void inici() {
    System.out.println("Llegiu un real pel teclat:");
    double a = llegirRealTeclat();
    System.out.println("El real ha estat " + a + ".");
    System.out.println("Llegiu un altre real pel teclat:");
    a = llegirRealTeclat();
    System.out.println("L’altre real ha estat " + a + ".");
  }
  public double llegirRealTeclat() {

    Scanner lector = new Scanner(System.in);
    double realLlegit = 0.0;
    boolean llegit = false;

    while (!llegit) {
      llegit = lector.hasNextDouble();
      if (llegit) {
        realLlegit = lector.nextDouble();
      }
      else {
        System.out.println("Això no és un nombre real.");
        lector.next();
      }
    }

    lector.nextLine();
    return realLlegit;
  }
}
