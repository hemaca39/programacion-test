public class ej2r {

    public static double areaQuadrat(double costat) {
        return costat * costat;
    }

    public static double areaCercle(double radi) {
        return Math.PI * (radi * radi);
    }

    public static double areaTriangle(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static double areaRectangle(double costat1, double costat2) {
        return costat1 * costat2;
    }

    public static double areaTrapezi(double a, double b, double h) {
        return ((a + b) * h) / 2.0;
    }

    public static double areaRombe(double dM, double dm) {
        return (dM * dm) / 2.0;
    }

    public static double areaParalelogram(double b, double h) {
        return b * h;
    }
}