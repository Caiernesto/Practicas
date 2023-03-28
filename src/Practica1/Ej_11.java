package Practica1;

public class Ej_11 {
        public static boolean esVocal(char c){
            return "AEIOUaeiou".indexOf(c)>=0;
        }
        public static boolean encaja(String patron,String cadena){
            if (cadena.length()!=patron.length())
                return false;
            for(int i=0;i<cadena.length(); i++){
                if (patron.charAt(i)=='.') {
                    if (!esVocal(cadena.charAt(i)))
                        return false;

                }
                else if (cadena.charAt(i)!=patron.charAt(i)){
                        return false;

                }
            }
            return true;
        }
    public static void main(String[] args) {
        prueba("r.j.", "verde", false);
        prueba("r.j.", "rojo", true);
        prueba("r.j.", "reja", true);
        prueba("r.j.", "reza", false);
        prueba("r.j.", "rrjj", false);
        prueba("r.j.", "puja", false);
    }
    public static void prueba(String patrón, String cadena, boolean esperado) {
        boolean resultado = encaja(patrón, cadena);
        System.out.format("Prueba con %s y %s --> %s: ", patrón, cadena, resultado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.format("error (se esperaba %s)%n", esperado);
    }
        }


