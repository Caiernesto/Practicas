package Practica1;

public class Ej_23 {public static int masOlasDeFrio(double[][] matriz, int n){
    int año_mas_olas=-1;
    int num_mas_olas=0;
    for(int j=0;j<matriz[0].length;j++){
        int contador=0;
        int numero_olas=0;
        for(int i=0;i<matriz.length;i++){
            if(matriz[i][j]<0){
                contador++;
                if(contador==n){
                    numero_olas++;
                }
            }
            else{
                contador=0;}
            if(matriz[i][j]<=0){
                contador=0;
            }
        }
        if (numero_olas>=num_mas_olas){
            num_mas_olas=numero_olas;
            año_mas_olas=1900+j;
        }
    }

    return año_mas_olas;
}
}
