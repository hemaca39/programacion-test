public class rectangle {
    private int costat1;
    private int costat2;

    public rectangle() {
    }

    public void setDades(int c1, int c2) {
        this.costat1 = c1;
        this.costat2 = c2;
    }
    public void calcularArea() {
        this.area = (double) costat1 * costat2;
    }
}