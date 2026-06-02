public class Main2 {
    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Hector", 18);
        Persona2 p2 = new Persona2("Sergi", 19);

        System.out.println(p1.getNom() + p1.getEdat());
        System.out.println(p2.getNom() + p2.getEdat());
    }
}