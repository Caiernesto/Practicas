package Practica1;

import java.util.Scanner;

public class Ej_9 {
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
        int multiplicacion=1;
        for(int i=1; i<n; i++) {
            es_primo = esPrimo(i);
            if (es_primo == true) {
                multiplicacion *= i;
            }
        }
        es_primo=esPrimo(n);
        if (es_primo == true) {
            multiplicacion *= n;
        }
        System.out.println(n+"# = "+multiplicacion);
    }
}
