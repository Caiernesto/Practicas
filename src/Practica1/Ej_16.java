package Practica1;

public class Ej_16 {
    public static int contarOlasDeFrio(double[] vector, int n) {
        int olas_frio = 0;
        int dias = 0;
        boolean ola = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                dias += 1;
                if (dias > n && (ola == false)) {
                    olas_frio += 1;
                    ola = true;
                }
            }
            if (vector[i] >= 0) {
                dias = 0;
                ola = false;
            }
        }
        return olas_frio;
    }
}
