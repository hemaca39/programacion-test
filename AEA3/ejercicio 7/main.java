public class main {
    public static void main(String[] args) {
        triangle t = new triangle(23, 24);
        t.calcularArea();
        t.mostrarArea();

        quadrat q = new quadrat(6);
        q.calcularArea();
        q.mostrarArea();

        rectangle r = new rectangle();
        r.setDades(8, 6);
        r.calcularArea();
        r.mostrarArea();

        trapezi tr = new trapezi(10, 5, 4);
        tr.calcularArea();
        tr.mostrarArea();

        rombe rb = new rombe(12, 8);
        rb.calcularArea();
        rb.mostrarArea();

        paralelogram p = new paralelogram(10, 5);
        p.calcularArea();
        p.mostrarArea();

        cercle c = new cercle(23);
        c.calcularArea();
        c.mostrarArea();
    }
}