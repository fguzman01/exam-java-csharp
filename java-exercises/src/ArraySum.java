/*
Enunciado

Escribe un método en Java que reciba un array de enteros y devuelva la suma de todos sus elementos.

Ejemplo:

Entrada: [1, 2, 3, 4, 5]

Salida: 15
*/

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, -5, 7};

        System.out.println("La suma del array 1 es: " + sumArray(numbers1));
        System.out.println("La suma del array 2 es: " + sumArray(numbers2));
    }

    public static int sumArray(int[] array) {
         if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        return sum;
    }
    
}
