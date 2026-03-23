public abstract class allotjament {
    protected String nom;
    protected int capacitat;
    protected boolean disponible;

    public allotjament(String nom, int capacitat, boolean disponible) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = disponible;
    }

    public abstract double calcularPreuPerNit();

    public String mostrarInformacio() {
        return "Nom: " + nom + ", Capacitat: " + capacitat + ", Disponible: " + disponible;
    }

    public boolean reservar() {
        if (disponible) {
            this.disponible = false;
            return true;
        }
        return false;
    }

    public void alliberar() {
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }
}