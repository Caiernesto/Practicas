package Practica1;

public class Ej_27 {public static int contarTerminales(int[][] matriz_combinaciones){
    int contador=0;
    for(int i=0;i<matriz_combinaciones.length;i++){
        boolean es_terminal=true;
        for (int j=0;j<matriz_combinaciones.length;j++){
            if (matriz_combinaciones[i][j]!=-1){
                es_terminal=false;
                break;
            }
            if (es_terminal){
                contador++;
            }
        }
    }
    return contador;
}
}
