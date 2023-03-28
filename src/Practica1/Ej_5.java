package Practica1;

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        int n;
        boolean es_primo;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n=entrada.nextInt();
        int multiplicacion=1;
        for(int i=1; i<n; i++) {
            es_primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    es_primo = false;
                    break;
                }
            }
            if (es_primo == true) {
                multiplicacion *= i;
            }
        }
        es_primo=true;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                es_primo = false;
                break;
            }
        }
        if (es_primo == true) {
            multiplicacion *= n;
        }
        System.out.println(n+"# = "+multiplicacion);
    }
}
