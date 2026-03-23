package UF2.Examen_v2;

public class NotaAText {
    public String notaAText(double nota) {
        if (nota < 5) return "Suspés";
        if (nota < 7) return "Aprovat";
        if (nota < 9) return "Notable";
        return "Excel·lent";
    }
}