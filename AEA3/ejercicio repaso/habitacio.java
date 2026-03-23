public class habitacio extends allotjament {
    private int numLlits;

    public habitacio(String nom, int capacitat, boolean disponible, int numLlits) {
        super(nom, capacitat, disponible);
        this.numLlits = numLlits;
    }

    @Override
    public double calcularPreuPerNit() {
        return numLlits * 30.0;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Llits: " + numLlits;
    }
}