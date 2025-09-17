using System;

public static class Palindrome
{
    public static bool IsPalindrome(string text)
    {
        text = text.Replace(" ", "").ToLower();

        int i = 0;
        int j = text.Length - 1;
        
        while (i < j)
        {
            if (text[i] != text[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}