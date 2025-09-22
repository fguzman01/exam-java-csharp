/*
 * 
Enunciado

Escribe un método en Java que ordene un array de enteros en orden ascendente utilizando Arrays.sort().

Ejemplo:

Entrada: [7, 1, 4, 9, 3]

Salida: [1, 3, 4, 7, 9] 
 */

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 4, 9, 3};

        System.out.println("Array original: " + Arrays.toString(numbers));
        Arrays.sort(numbers); // ordena el array en su lugar
        System.out.println("Array ordenado: " + Arrays.toString(numbers));
    }
}
