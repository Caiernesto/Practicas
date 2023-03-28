package Practica1;

public class Ej_28 {public static String elementoMásCombinable(int[][] matriz_combinaciones, String[] vector_elementos){
    String mas_compatible="";
    int num_compa=0;
    int indice=-1;
    for(int i=0;i<matriz_combinaciones.length;i++){
        int contador=0;
        for (int j=0;j<matriz_combinaciones.length;j++){
            if (matriz_combinaciones[i][j]!=-1){
                contador++;
            }
            if (contador>=num_compa){
                num_compa=contador;
                indice=i;
            }
        }
    }
    mas_compatible=vector_elementos[indice];

    return mas_compatible;
}
}
