class Animal {
    private String nom;
    private int edat;

    public Animal(String nom, int edat) {
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

    public void sound() {
        System.out.println("So animal");
    }
}

class Dog extends Animal {

    public Dog(String nom, int edat) {
        super(nom, edat);
    }

    public void bark() {
        System.out.println("Guau");
    }

    @Override
    public void sound() {
        System.out.println("El gos fa: guau");
    }
}

class Cat extends Animal {

    public Cat(String nom, int edat) {
        super(nom, edat);
    }

    public void meow() {
        System.out.println("Miau");
    }

    @Override
    public void sound() {
        System.out.println("El gat fa: miau");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        Cat cat = new Cat("Mishi", 2);

        dog.sound();
        dog.bark();

        cat.sound();
        cat.meow();
    }
}
