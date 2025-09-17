public class Palindrome {
    public static void main(String[] args) {
        String word1 = "oso";
        String word2 = "casa";

        System.out.println(isPalindrome(word1)); // true
        System.out.println(isPalindrome(word2)); // false
    }



public static boolean isPalindrome(String text) {

    text = text.replaceAll("\\s+", "").toLowerCase();

    int i = 0;
    int j = text.length() - 1;

    while (i < j) {
        if (text.charAt(i) != text.charAt(j)) {
            return false;
        }
        i++;
        j--;
        
    }
    
    return true;
}

}

