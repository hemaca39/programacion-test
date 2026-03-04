public class quadrat {
    private int costat;

    public Quadrat(int c) {
        this.costat = c;
    }

    public void calcularArea() {
        this.area = Math.pow(costat, 2);
    }
}