/*
 * Enunciado

Escribe un método en Java que reciba un array de enteros y devuelva true si el array está ordenado de menor a mayor, y false en caso contrario.

Ejemplos:

Entrada: [1, 2, 3, 4, 5] → true

Entrada: [3, 2, 5, 7] → false
 */


public class ArraySorted {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {3, 2, 5, 7};
        int[] equalValues = {2, 2, 2, 2};

        System.out.println("¿sortedArray está ordenado? " + isSorted(sortedArray));
        System.out.println("¿unsortedArray está ordenado? " + isSorted(unsortedArray));
        System.out.println("¿equalValues está ordenado? " + isSorted(equalValues));
    }

    public static boolean isSorted(int[] array) {
         if (array == null || array.length <= 1) {
            return true; // un array vacío o de un elemento se considera ordenado
        }

        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                return false; // Si encontramos un par desordenado, devolvemos false
            }
        }

        return true; // Si no encontramos ningún desorden, el array está ordenado

        
    }
    
}
