package Practica1;

public class Ej_20 {public static int[] eliminarVector(int[] vector, int num){
    int[] vector_resu=new int[vector.length];
    int contador=0;
    for(int i=0; i< vector.length;i++){
        if(vector[i]!=num){
            vector_resu[contador]=vector[i];
            contador++;}

    }
    return vector_resu;
}}
