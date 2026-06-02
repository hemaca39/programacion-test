public class Main {

    public static void imprimirChars(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        imprimirChars('*', 3);
    }
}
