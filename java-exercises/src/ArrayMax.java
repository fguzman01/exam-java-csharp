/*
 * Enunciado

Escribe un programa en Java que reciba un array de enteros y devuelva el número mayor que contiene.

Ejemplo:

Entrada: [3, 7, 2, 9, 5]

Salida: 9
 */

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers1 = {3, 7, 2, 9, 5};
        int[] numbers2 = {-10, -3, -25, -1};

        System.out.println("El máximo del array 1 es: " + findMax(numbers1));
        System.out.println("El máximo del array 2 es: " + findMax(numbers2));
    }

     public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo o vacío");
        }

        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }

        return max;
     }
    
    
}
