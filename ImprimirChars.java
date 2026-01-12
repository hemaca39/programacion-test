public class ImprimirChars {
    public static void imprimir(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println(); 
    }

    public static void main(String[] args) {

        imprimir('*', 5);  
        imprimir('#', 3);  
        imprimir('A', 3);  
    }
}
