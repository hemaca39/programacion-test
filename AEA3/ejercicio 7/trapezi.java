public class trapezi {
    private int a, b, h;

    public trapezi(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public void calcularArea() {
        this.area = (double) ((a + b) * h) / 2;
    }
}