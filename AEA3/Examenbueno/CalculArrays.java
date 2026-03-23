package UF2.Examen_v2;

public class CalculArrays {
    
    public double calcularMaxim(double[] array) {
        double max = array[0];
        for (double n : array) {
            if (n > max) max = n;
        }
        return max;
    }

    public double calcularMinim(double[] array) {
        double min = array[0];
        for (double n : array) {
            if (n < min) min = n;
        }
        return min;
    }

    public double calcularMitjana(double[] array, int mida) {
        double suma = 0;
        for (int i = 0; i < mida; i++) {
            suma += array[i];
        }
        return suma / mida;
    }
}