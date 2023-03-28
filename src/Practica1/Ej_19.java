package Practica1;

public class Ej_19 {public static int[] eliminarPosicion(int[] vector, int num){
    int[] vector_resu=new int[vector.length];
    for(int i=0; i< vector.length;i++){
        if(i!=num){
            vector_resu[i]=vector[i];}

    }
    return vector_resu;
}
}
