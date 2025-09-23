/*
 * 📌 Enunciado

Escribe un método en Java que reciba una cadena formada por los caracteres ()[]{} y determine si está balanceada.

👉 Una cadena está balanceada si:

Cada apertura ((, {, [) tiene su respectivo cierre.

El orden es correcto.

Ejemplos:

Entrada: "([])" → ✅ balanceada

Entrada: "([)]" → ❌ no balanceada

Entrada: "((()))" → ✅ balanceada
 */

import java.util.Stack;

public class BracketBalance {
    public static void main(String[] args) {
        String s1 = "([])";
        String s2 = "([)]";
        String s3 = "((()))";
        String s4 = "{[()]}";

        System.out.println(s1 + " → " + isBalanced(s1));
        System.out.println(s2 + " → " + isBalanced(s2));
        System.out.println(s3 + " → " + isBalanced(s3));
        System.out.println(s4 + " → " + isBalanced(s4));
    }

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
          // Si es un carácter de apertura, lo metemos al stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // Si es un carácter de cierre, verificamos el último abierto
            
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false; // No hay apertura para este cierre

                char lastOpened = stack.pop();
                if ((c == ')' && lastOpened != '(') ||
                    (c == ']' && lastOpened != '[') ||
                    (c == '}' && lastOpened != '{')) {
                    return false; // No coinciden
                }
            }         
    }
        return stack.isEmpty(); // Si el stack está vacío, está balanceado
    }
}
