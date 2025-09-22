/*
Escribe un método en Java que reciba un texto y un carácter, y devuelva cuántas veces aparece ese carácter en el texto.

Ejemplo:

Entrada: "programacion", 'o'

Salida: 2 

*/

public class CharCount{

    public static void main(String[] args) {
        String text1 = "programacion";
        char target1 = 'o';

        String text2 = "Java";
        char target2 = 'a';

        System.out.println("El caracter " + target1 + " aparece " + countOccurrences(text1, target1) + " veces en " + text1);
        System.out.println("El caracter " + target2 + " aparece " + countOccurrences(text2, target2) + " veces en " + text2);
    }

    public static int countOccurrences(String text, char target) {
        
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i< text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }

        }

        return count;
    }

    
    
}
