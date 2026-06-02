class Persona {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void info() {
        System.out.println("Nom: " + nom);
        System.out.println("Edat: " + edat);
    }
}

class Estudiant extends Persona {
    private String curs;
    private double[] notes;
    private int comptador;

    public Estudiant(String nom, int edat, String curs) {
        super(nom, edat);
        this.curs = curs;
        notes = new double[10];
        comptador = 0;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public void afegirNota(double n) {
        if (comptador < notes.length) {
            notes[comptador] = n;
            comptador++;
        }
    }

    public double calcularMitjana() {
        double suma = 0;

        for (int i = 0; i < comptador; i++) {
            suma += notes[i];
        }

        return suma / comptador;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Curs: " + curs);
        System.out.println("Mitjana: " + calcularMitjana());
    }
}

class EstudiantPremium extends Estudiant {
    private double descompteQuota;

    public EstudiantPremium(String nom, int edat, String curs, double descompteQuota) {
        super(nom, edat, curs);
        this.descompteQuota = descompteQuota;
    }

    public double getDescompteQuota() {
        return descompteQuota;
    }

    public void setDescompteQuota(double descompteQuota) {
        this.descompteQuota = descompteQuota;
    }

    public double calcularBonusMitjana() {
        return calcularMitjana() + 0.5;
    }


    public void info() {
        super.info();
        System.out.println("Descompte: " + descompteQuota);
        System.out.println("Bonus Mitjana: " + calcularBonusMitjana());
    }
}

public class Main4 {
    public static void main(String[] args) {

        Estudiant e1 = new Estudiant("Marc", 18, "DAM1");
        e1.afegirNota(7);
        e1.afegirNota(8);
        e1.afegirNota(9);

        EstudiantPremium e2 = new EstudiantPremium("Hector", 18, "DAM1", 20);
        e2.afegirNota(8);
        e2.afegirNota(9);
        e2.afegirNota(10);

        e1.info();
        System.out.println();

        e2.info();
    }
}