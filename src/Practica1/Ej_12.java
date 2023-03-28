package Practica1;

public class Ej_12 {
    public static void main(String[] args) {
        prueba("verde casa",2 );
        prueba(" rojo cara ", 2 );
        prueba("alta ga  reja", 3);
        prueba("reza la monja ", 3);
        prueba("rrjj tta gsga h", 4);
        prueba("puja empuja ja aj js  ", 5);
    }
    public static int contarPalabras(String cadena) {
        int cantidad_palabras=1;
        for(int i=1; i<cadena.length();i++){
            if(cadena.charAt(i)==' ' && i<cadena.length()-1 && cadena.charAt(i+1)!=' ')
                cantidad_palabras++;

        }
        return cantidad_palabras;
    }
    public static boolean esVocal(char c) {
        return "AEIOUaeiou".indexOf(c) >= 0;
    }
    public static void prueba(String cadena, int esperado) {
        int resultado = contarPalabras(cadena);
        System.out.format("Prueba con %s --> %s: ", cadena, resultado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.format("error (se esperaba %s)%n", esperado);
    }
}
