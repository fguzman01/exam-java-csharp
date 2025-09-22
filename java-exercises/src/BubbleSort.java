/*
 * Enunciado

Escribe un método en Java que ordene un array de enteros en orden ascendente usando Bubble Sort.

Ejemplo:

Entrada: [5, 3, 8, 4, 2]

Salida: [2, 3, 4, 5, 8]
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Array original: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Array ordenado: " + Arrays.toString(numbers));
    }

    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return array; // Devuelve el array tal cual si es nulo o vacío
        }

        boolean swapped;
        int n = array.length;
        do{
            swapped = false;
            for(int i=0; i<n-1; i++){
                if(array[i] > array[i+1]){
                    // Intercambiar array[i] y array[i+1]
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            n--; // Después de cada pasada, el último elemento está en su lugar correcto
        } while (swapped);
       
        return array;
        
    }
    
    
}
