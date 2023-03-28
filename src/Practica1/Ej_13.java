package Practica1;

public class Ej_13 {public static String obtenerPalabra(String cadena, int i){
    String palabra_requerida="";
    int j;
    for(j=i;j<cadena.length() && cadena.charAt(j)!=' '; j++ );
    if (i==j)
        return null;
    palabra_requerida= cadena.substring(i,j);
    return palabra_requerida;
}
}
