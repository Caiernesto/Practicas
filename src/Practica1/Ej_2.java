package Practica1;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        int n;
        int doblefactorial;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n = entrada.nextInt();
        if (n == 0 || n == 1) {
            doblefactorial = 1;
        } else if (n % 2 == 0) {
            doblefactorial = 2;
            for (int i = 2; i <= n; i += 2) {
                doblefactorial *= i;
            }
        } else {
            doblefactorial = 1;
            for (int i = 1; i <= n; i += 2) {
                doblefactorial *= i;
            }}
        System.out.println(n + "!! = " + doblefactorial);
        entrada.close();

    }
}