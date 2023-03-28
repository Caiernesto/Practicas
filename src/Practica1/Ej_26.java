package Practica1;

public class Ej_26 {public static String[] combinamblesConsigo(int[][] matriz_combinaciones,String[] vector_elementos){
    String[] aux=new String[vector_elementos.length];
    int contador=0;
    for(int i=0;i<vector_elementos.length;i++){
        if (matriz_combinaciones[i][i]!=0){
            aux[contador]=vector_elementos[i];
            contador++;
        }
    }
    String[] reultado=new String[vector_elementos.length];
    for (int i=0;i<contador;i++){
        reultado[i]=aux[i];
    }
    return reultado;
}
}
