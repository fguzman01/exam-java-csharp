/* 
FizzBuzz
 
Enunciado:

Escribe un programa en Java que imprima los números del 1 al 100, pero:
- Si el número es múltiplo de 3, imprime "Fizz".
- Si el número es múltiplo de 5, imprime "Buzz".
- Si es múltiplo de ambos (3 y 5), imprime "FizzBuzz"
 */


public class FizzBuzz{

    public static void main(String[] args) {
        runFizzBuzz(100);
    }

    public static void runFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i%3 == 0) {
                System.out.println("Fizz");
            }else if (i%5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

}