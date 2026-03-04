public class triangle {
    private int base;
    private int h;

    public triangle(int b, int a) {
        this.base = b;
        this.h = a;
    }

    public void calcularArea() {
        this.area = (double) (base * h) / 2;
    }
}