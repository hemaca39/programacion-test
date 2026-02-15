public class Deve extends Employee {
    private String lenguajeProgramacion;

    public Deve(String nombre, String direccion, double salario, String lenguajeProgramacion) {
        super(nombre, direccion, salario, "Developer");
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10; 
    }

    public void escribirCodigo() {
        System.out.println(nombre + " está escribiendo código en " + lenguajeProgramacion + ".");
    }
}