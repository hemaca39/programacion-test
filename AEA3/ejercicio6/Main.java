
public class Main {
    public static void main(String[] args) {
        Programer prog = new Programer("Marc Marquez", "Paseig de Gracia", 2500);
        Manager mgr = new Manager("Fernando alonso", "Montepinar", 4000, 5);
        Deve dev = new Deve("Joan Mir", "Abe del paraiso", 3000, "Java");

        System.out.println(prog.generarReport());
        prog.debug();

        System.out.println(mgr.generarReport());
        mgr.gestionProyecto();

        System.out.println(dev.generarReport());
        dev.escribirCodigo();
    }
}