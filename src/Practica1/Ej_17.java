package Practica1;

public class Ej_17 {public static boolean hayRepetidos(int[] vector){
    for(int i=0; i<vector.length;i++){
        for(int j=i+1; j< vector.length;j++){
            if(vector[i]==vector[j])
                return true;
        }
    }
    return false;
}
}
