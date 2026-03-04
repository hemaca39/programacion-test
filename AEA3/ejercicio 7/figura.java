public abstract class figura {

    protected double area;

    public figura() {
    }

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void mostrarArea() {
        System.out.println("area:" + area);
    }
}
