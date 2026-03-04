public class cercle extends figura {
    private int radi;

    public cercle(int r) {
        this.radi = r;
    }
    
    public void calcularArea() {
        this.area = Math.PI * Math.pow(radi, 2);
    }
}