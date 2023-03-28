package Practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
}

    public static void main(String[] args) throws FileNotFoundException {
        String[] elementos = {"agua", "aire", "fuego", "tierra", "piedra", "arena", "lava", "desierto", "cristal", "reloj_de_arena"};
        int[][] matrizCombinaciones = crarMatrizCombinaciones(elementos, "alquimia10.txt");

        // Comprobamos que la matriz es simétrica
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos.length; j++) {
                if (matrizCombinaciones[i][j] != matrizCombinaciones[j][i]) {
                    System.out.println("La matriz no es simétrica");
                    return;
                }
            }
        }

        // Comprobamos algunas combinaciones válidas
        assert matrizCombinaciones[0][1] == 4; // agua + aire = piedra
        assert matrizCombinaciones[1][2] == 5; // aire + fuego = arena
        assert matrizCombinaciones[3][7] == -1; // tierra + desierto no es combinable

        // Comprobamos algunas combinaciones no válidas
        assert matrizCombinaciones[2][6] == -1; // fuego + lava no es combinable
        assert matrizCombinaciones[4][4] == -1; // piedra + piedra no es combinable
        assert matrizCombinaciones[9][2] == -1; // reloj_de_arena + fuego no es combinable

        System.out.println("Todas las pruebas han pasado");
    }}