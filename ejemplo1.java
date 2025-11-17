public class matriu {
    public static void main(String[] args) {

        int[] [] matriu = {
            {1, 2, 3,},
            {4, 5, 6,},
            {7, 8, 9,}
        }; 
        
        System.out.println("elements de la matriu:");

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}