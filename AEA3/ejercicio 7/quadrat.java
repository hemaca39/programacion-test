public class quadrat {
    private int costat;

    public quadrat(int c) {
        this.costat = c;
    }

    public void calcularArea() {
        this.area = Math.pow(costat, 2);
    }
}