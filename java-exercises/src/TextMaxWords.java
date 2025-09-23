import java.util.Arrays;

public class TextMaxWords {
    public static void main(String[] args) {
        String s1 = "Hola Mundo. como estas hoy.";
        String s2 = "Hola, mundo! ¿Cómo estás? Bien; gracias.";
        String s3 = "Uno,dos,tres... cuatro  cinco   seis!";
        String s4 = "..., ; !!  "; // solo puntuación/espacios

        System.out.println(s1 + " → max palabras: " + maxWordsBetweenPunctuation(s1));
        System.out.println(s2 + " → max palabras: " + maxWordsBetweenPunctuation(s2));
        System.out.println(s3 + " → max palabras: " + maxWordsBetweenPunctuation(s3));
        System.out.println(s4 + " → max palabras: " + maxWordsBetweenPunctuation(s4));
    }

    /**
     * Devuelve el máximo número de palabras entre separadores de puntuación.
     * Considera como separadores: . , ; : ! ? (y repeticiones de ellos)
     * Palabra = secuencia de caracteres separada por espacios.
     */

     public static int maxWordsBetweenPunctuation(String text) {
         if (text == null || text.isBlank()) return 0;

          String[] segments = text.split("[\\.,;:!?]+");

          int max = 0;
          for (String seg : segments) {
            // Limpiamos espacios en los extremos
            String trimmed = seg.trim();

            if (trimmed.isEmpty()) continue;

            // Contamos palabras separando por uno o más espacios
            String[] words = trimmed.split("\\s+");
            max = Math.max(max, words.length);
          }
          return max;
     }


    
}
