/*
 
Enunciado

Escribe un programa en Java que calcule el factorial de un número.

El factorial de n (n!) es el producto de todos los enteros positivos hasta n.

Ejemplo:

5! = 5 × 4 × 3 × 2 × 1 = 120

 */

public class Factorial {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 0;

        System.out.println("Factorial de " + n1 + " (iterativo): " + factorialIterative(n1));
        System.out.println("Factorial de " + n1 + " (recursivo): " + factorialRecursive(n1));

        System.out.println("Factorial de " + n2 + " (iterativo): " + factorialIterative(n2));
        System.out.println("Factorial de " + n2 + " (recursivo): " + factorialRecursive(n2));
    }

    public static long factorialIterative(int n){
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;

    }

     // Versión recursiva
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
}
