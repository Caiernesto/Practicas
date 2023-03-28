package Practica1;

public class Ej_15 {public static boolean estaOrdenado(String[] vector){
    for(int i=1; i< vector.length; i++){
        if(vector[i].compareTo(vector[i-1])<0)
            return false;
    }
    return true;
}
}
