package Practica1;

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        int n;
        int factorial=1;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Inroduce un número entero: ");
        n=entrada.nextInt();
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        System.out.println(n+"!"+" = "+factorial);
        entrada.close();
    }
}
