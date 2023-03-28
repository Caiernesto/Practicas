package Practica1;

public class Ej_18 {public static String[] encajan(String patron,String[] vector){
    String[] vector_res=new String[vector.length];
    int resultados=0;
    for(int i=0;i< vector.length;i++){
        if (vector[i].length()==patron.length()){
            boolean encajan=true;
            for(int j=0;j<vector[i].length(); j++){
                if (patron.charAt(j)=='.') {
                    if (!esVocal(vector[i].charAt(j))){
                        encajan=false;
                }}
                else if (vector[i].charAt(j)!=patron.charAt(j)){
                    encajan=false;
                    break;
            }}
        if (encajan){
            vector_res[resultados]=vector[i];
            resultados++;}
        }
    }
    return vector_res;
}
    public static boolean esVocal(char c){
        return "AEIOUaeiou".indexOf(c)>=0;
    }

}
