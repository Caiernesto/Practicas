package Practica1;

public class prueba {public static String[] encajan(String patron, String[] vectorCadenas){

    String[] auxiliar=new String[vectorCadenas.length];
    int contador=0;
    String[] resultado=new String[0];
    for(int i=0; i<vectorCadenas.length; i++){
        if(vectorCadenas[i].length()==patron.length()){
            boolean encajan=true;
            for(int j=0;j<vectorCadenas[i].length();j++){
                if(vectorCadenas[i].charAt(j)=='.'){
                    if(!esVocal1(vectorCadenas[i].charAt(j)))
                        encajan=false;
                    break;
                }
                else if (vectorCadenas[i].charAt(j)!=patron.charAt(j)){
                    encajan=false;
                    break;
                }
            }
            if(encajan){
                auxiliar[contador]=vectorCadenas[i];
                contador++;
            }
            resultado=new String[contador];
            for(int w=0;i<contador;i++){
                resultado[w]=auxiliar[w];
            }

        }

    }
    return resultado;
}
    public static boolean esVocal1(char c) {
        return "AEIOUaeiou".indexOf(c) >= 0;
    }}
