import java.util.InputMismatchException;
import java.util.Scanner;

public class InicialitzaParells {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int[] nombresParells = new int[10];
        int comptador = 0;

        System.out.println("Introdueix 10 nombres parells:");

        while (comptador < 10) {
            try {
                System.out.print("Nombre " + (comptador + 1) + ": ");
                int num = teclat.nextInt();

                if (num % 2 != 0) {
                    throw new Exception("el nombre no és parell.");
                }
                nombresParells[comptador] = num;
                comptador++;

            } catch (InputMismatchException e) {
                System.out.println("error: Has de introduir un número enter vàlid.");
                teclat.next();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("array de nombres parells");
        for (int n : nombresParells) {
            System.out.print(n + " ");
        }

    }
}