package Practica1;

import java.util.Scanner;

public class Ej_3 { public static void main(String[] args) {
        int n;
        boolean es_primo=true;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n=entrada.nextInt();
        for(int j=2; j<=Math.sqrt(n); j++){
            if(n%j==0){
                es_primo=false;
                break;
                }
            }
        if (es_primo==true){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
}
}
