public class CercaDicotomica {

    public int cercaDicotomica(double[] array, int inici, int fi, double valor) {
        if (inici > fi) return -1; 

        int mig = inici + (fi - inici) / 2;

        if (array[mig] == valor) return mig; 
        
        if (array[mig] > valor) {
            return cercaDicotomica(array, inici, mig - 1, valor);
        } else {
            return cercaDicotomica(array, mig + 1, fi, valor);
        }
    }
}