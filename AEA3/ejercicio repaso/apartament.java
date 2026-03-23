public class apartament extends allotjament {
    private int habitacions;
    private boolean teCuina;

    public apartament(String nom, int capacitat, boolean disponible, int habitacions, boolean teCuina) {
        super(nom, capacitat, disponible);
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    @Override
    public double calcularPreuPerNit() {
        double preuBase = habitacions * 45.0;
        return teCuina ? preuBase + 15.0 : preuBase;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Habitacions: " + habitacions + ", Cuina: " + teCuina;
    }
}