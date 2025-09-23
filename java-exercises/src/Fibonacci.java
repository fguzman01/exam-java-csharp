/*
 * Enunciado

Escribe un programa en Java que:

Verifique el n-ésimo número de Fibonacci.

Imprima la secuencia de Fibonacci hasta un número n.

👉 La secuencia empieza con:
0, 1, 1, 2, 3, 5, 8, 13, …
 */

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("El " + n + "° número de Fibonacci (iterativo) es: " + fibonacciIterative(n));
        System.out.println("El " + n + "° número de Fibonacci (recursivo) es: " + fibonacciRecursive(n));

        System.out.println("Secuencia de Fibonacci hasta " + n + ": " + fibonacciSequence(n));
    }

    // Método iterativo para obtener el n-ésimo número de Fibonacci
    public static int fibonacciIterative(int n){
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, result = 0;
        for(int i = 2; i<=n; i++){
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    // Método recursivo para obtener el n-ésimo número de Fibonacci
    public static int fibonacciRecursive(int n){
        if (n <= 0) return 0;
        if(n == 1) return 1;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Generar secuencia hasta n
    public static List<Integer> fibonacciSequence(int n){
        List<Integer> sequence = new ArrayList<>();

        if(n <= 0) return sequence;

        int a=0, b=1;
        sequence.add(a);
        if (n > 1) sequence.add(b);

        for (int i=2; i < n; i++){
            int next = a+b;
            sequence.add(next);
            a = b;
            b = next;
        }
        return sequence;
    }
    
}
