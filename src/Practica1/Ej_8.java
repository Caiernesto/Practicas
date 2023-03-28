package Practica1;

import java.util.Scanner;

public class Ej_8 {
    public static boolean esPrimo(int numero){
        boolean es_primo=true;
        for(int j=2; j<=Math.sqrt(numero); j++){
            if(numero%j==0){
                es_primo=false;
                break;
            }
        }
        if (es_primo==true){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n;
        boolean es_primo;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n=entrada.nextInt();
        String cadena="Los números primos menores que "+n+" son:";
        for(int i=2; i<n; i++){
            es_primo=true;
            es_primo=esPrimo(i);
            if (es_primo==true){
                cadena=cadena+" "+i;
            }
        }
        System.out.println(cadena);
    }
}
