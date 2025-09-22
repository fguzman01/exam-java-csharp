/*
 * Enunciado

Escribe un método en Java que reciba una cadena y devuelva la misma cadena invertida.
Ejemplo:

Entrada: "hola"

Salida: "aloh"
 */

public class ReverseString {
    public static void main(String[] args) {
        String text1 = "hola";
        String text2 = "Java";

        System.out.println(text1 + "invertido es: " + reverse(text1));
        System.out.println(text2 + "invertido es: " + reverse(text2));
        
    }

    public static String reverse(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
        
    }
    
}
