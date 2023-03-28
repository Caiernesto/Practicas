package Practica1;

public class Ej_22 {
    public static int posicionIntersecion(int[] vector, int num) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= num) {
                posicion = i;
            }
        }
        return posicion;
    }
}
