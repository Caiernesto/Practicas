package Practica1;

public class Ej_14 { public static int últimaPosición(int[] vector, int num){
    int posicion_valor=-1;
    for (int i=0; i<vector.length; i++){
        if (vector[i]==num)
            posicion_valor=i;
    }
    return posicion_valor;
}
}
