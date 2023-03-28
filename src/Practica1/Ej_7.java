package Practica1;

import java.util.Scanner;

public class Ej_7 {
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
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n=entrada.nextInt();
        boolean es_primo;
        es_primo=esPrimo(n);
        if (es_primo==true)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
