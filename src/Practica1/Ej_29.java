package Practica1;

public class Ej_29 {public static int múltiplesCombinaciones(int[][] matriz_combinaciones){
    int num_combianciones=0;
    for(int w=0;w<matriz_combinaciones.length;w++){
        int contador=0;
        for(int i=0;i<matriz_combinaciones.length;i++){
            for (int j=0;j<matriz_combinaciones.length;j++){
                if (matriz_combinaciones[i][j]==w){
                    contador++;
                }
            }
        }
        if(contador/2>=2){
            num_combianciones++;
        }
    }
    return num_combianciones;
}
}
