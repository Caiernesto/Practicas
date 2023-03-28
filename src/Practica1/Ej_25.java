package Practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej_25 {public static String elementoGenerado(int[][] matrizcombinaciones, String[] vector_elementos, String cadena1, String cadena2){
    int contador=0;
    int num1=-1;
    int num2=-1;
    int numres;
    String comb1=cadena1;
    String comb2=cadena2;
    String resultado = null;
    for(int i=0; i< vector_elementos.length; i++){
        if(comb1.equals(vector_elementos[i])){
            num1=i;
            contador++;
            if (contador==3)
                break;
        }
        if (comb2.equals(vector_elementos[i])){
            num2=i;
            contador++;
            if (contador==3)
                break;
        }

    }
    if (matrizcombinaciones[num1][num2]!=0) {
        numres=matrizcombinaciones[num1][num2];
        resultado=vector_elementos[numres];
    }

    return resultado;
}
    public class Ej_24 {public static int[][] crarMatrizCombinaciones(String[] vector_elementos, String fichero) throws FileNotFoundException {
        Scanner entrada=new Scanner(new File(fichero));
        int contador;
        int[][] matriz_combinaciones=new int[vector_elementos.length][vector_elementos.length];
        String[][] combinacion;
        for(int i=0; i<vector_elementos.length;i++){
            for(int j=0;j<vector_elementos.length;j++){
                matriz_combinaciones[i][j]=-1;
            }
        }
        entrada.close();
        while (entrada.hasNextLine()){
            contador=0;
            int num1=-1;
            int num2=-1;
            int numres=-1;
            String comb1=entrada.next();
            String comb2=entrada.next();
            String resultado=entrada.next();
            for(int i=0; i< vector_elementos.length; i++){
                if(comb1.equals(vector_elementos[i])){
                    num1=i;
                    contador++;
                    if (contador==3)
                        break;
                }
                if (comb2.equals(vector_elementos[i])){
                    num2=i;
                    contador++;
                    if (contador==3)
                        break;
                }
                if (resultado.equals(vector_elementos[i])){
                    numres=i;
                    contador++;
                    if (contador==3)
                        break;
                }
            }
            matriz_combinaciones[num1][num2]=numres;
            matriz_combinaciones[num2][num1]=numres;


        }
        return matriz_combinaciones;
}}}

