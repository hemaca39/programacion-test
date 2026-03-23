public class casarural extends allotjament {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural(String nom, int capacitat, boolean disponible, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat, disponible);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuPerNit() {
        double preu = 100.0;
        if (teJardi) preu += 20.0;
        if (tePiscina) preu += 40.0;
        return preu;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Jardí: " + teJardi + ", Piscina: " + tePiscina;
    }
}