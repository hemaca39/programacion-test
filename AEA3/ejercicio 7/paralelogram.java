public class paralelogram extends figura {
    private int b, h;

    public paralelogram(int b, int h) {
        this.b = b;
        this.h = h;
    }
    public void calcularArea() {
        this.area = (double) b * h;
    }
}