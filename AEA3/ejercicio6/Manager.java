public class Manager extends Employee {
    private int numTrabajadores;

    public Manager(String nombre, String direccion, double salario, int numTrabajadores) {
        super(nombre, direccion, salario, "Manager");
        this.numTrabajadores = numTrabajadores;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15; 
    }

    public void gestionProyecto() {
        System.out.println(nombre + " está gestionando un proyecto con " + numTrabajadores + " personas.");
    }
}