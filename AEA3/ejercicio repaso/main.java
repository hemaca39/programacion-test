public class main {
    public static void main(String[] args) {
        habitacio h = new habitacio("Suite", 2, true, 1);
        apartament a = new apartament("Loft BCN", 4, true, 2, true);
        casarural c = new casarural("Masia", 10, true, true, true);

        System.out.println(h.mostrarInformacio() + " -> Preu: " + h.calcularPreuPerNit() + "€");
        System.out.println(a.mostrarInformacio() + " -> Preu: " + a.calcularPreuPerNit() + "€");
        System.out.println(c.mostrarInformacio() + " -> Preu: " + c.calcularPreuPerNit() + "€");

        System.out.println("\nReservant habitació...");
        h.reservar();
        System.out.println("Estat habitació: " + (h.isDisponible() ? "Lliure" : "Ocupada"));
    }
}