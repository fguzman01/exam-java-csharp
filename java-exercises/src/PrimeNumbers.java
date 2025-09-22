/*
 * 
 Enunciado

Escribe un método en Java que determine si un número es primo.

Escribe otro método que liste todos los números primos hasta un valor n.

👉 Un número primo es mayor que 1 y solo divisible por 1 y por sí mismo.

Ejemplo:

Entrada: 7 → primo

Entrada: 10 → no primo

Lista hasta 20 → [2, 3, 5, 7, 11, 13, 17, 19]
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        int limit = 20;

        System.out.println(n1 + (isPrime(n1) ? " es primo" : " no es primo"));
        System.out.println(n2 + (isPrime(n2) ? " es primo" : " no es primo"));
        System.out.println("Números primos hasta " + limit + ": " + listPrimes(limit));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        // Si es par y no es 2 → no es primo
        if (n % 2 == 0) return false;

        // Probamos solo hasta la raíz cuadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }

    // Método para listar los primos hasta n
    public static List<Integer> listPrimes(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }
    
}
