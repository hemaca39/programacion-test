public class rombe {
    private int dM, dm;

    public rombe(int dM, int dm) {
        this.dM = dM;
        this.dm = dm;
    }
    public void calcularArea() {
        this.area = (double) (dM * dm) / 2;
    }
}