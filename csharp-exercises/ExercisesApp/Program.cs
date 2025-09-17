using System;

class Program
{
    static void Main(string[] args)
    {
        string word1 = "oso";
        string word2 = "casa";
        
        Console.WriteLine(Palindrome.IsPalindrome(word1)); // true
        Console.WriteLine(Palindrome.IsPalindrome(word2)); // false
    }
}
