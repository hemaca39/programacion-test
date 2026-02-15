public class Employee {
    protected String nombre;
    protected String direccion;
    protected double salario;
    protected String puestoTrabajo;

    public Employee(String nombre, String direccion, double salario, String puestoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    public double calcularBonus() {
        return 0;
    }

    public String generarReport() {
        return "Nombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nPuesto: " + puestoTrabajo +
                "\nSalario: " + salario +
                "\nBonus: " + calcularBonus() +
                "\n-------------------------";
    }
}