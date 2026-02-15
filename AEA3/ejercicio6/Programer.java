public class Programer extends Employee {

    public Programer(String nombre, String direccion, double salario) {
        super(nombre, direccion, salario, "Programmer");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.12; 
    }

    public void debug() {
        System.out.println(nombre + " está depurando errores en el código...");
    }
}