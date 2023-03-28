package Practica1;

import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {
        int n;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        n=entrada.nextInt();
        int contador_divisores=0;
        int mas_divisores=0;
        int numero_divisores=0;
        for(int i=0; i<=n; i++){
            contador_divisores=0;
            for(int j=1; j<=i; j++){
                if(i%j==0)
                    contador_divisores++;
            if (contador_divisores>=numero_divisores){
                numero_divisores=contador_divisores;
                mas_divisores=i;
            }
            }
        }
        System.out.println("El número con más divisores es "+mas_divisores+" ("+numero_divisores+" divisores)");
    }
}
