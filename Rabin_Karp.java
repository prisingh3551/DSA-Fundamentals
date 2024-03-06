// Initially calculate the hash value of the pattern.
// Start iterating from the starting of the string:
// Calculate the hash value of the current substring having length m.
// hash = (hash - (text[i - pattern_length] * (bpattern_length - 1)) % p) * b + text[i]
// If the hash value of the current substring and the pattern are same check if the substring is same as the pattern.
// If they are same, store the starting index as a valid answer. Otherwise, continue for the next substrings.
// Return the starting indices as the required answer.

import java.util.ArrayList;

public class Rabin_Karp{
    public static void main(String[] args) {
        String text = "HelloWorldHello";
        String pattern = "Hello";
        ArrayList<Integer> ans = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        int i, j;
        int p = 0; // hash value of pattern
        int t = 0; // hash value of text
        int h = 1;
        int q = 101; // a prime number
        int d = 256; //total number of ascii characters in input
        // the value of h = pow(d, m - 1) % q
        for(i = 0; i < m - 1; ++i)
            h = (h * d) % q;

        // hash value of pattern
        for(i = 0; i < m; ++i)
            p = (d * p + pattern.charAt(i)) % q;
        
        // hash value for first window of text
        for(i = 0; i < m; ++i)
            t = (d * t + text.charAt(i)) % q;
        
        // compare hash value of each window of text with hash value of pattern
        for(i = 0; i <= n - m; ++i)
        {
            // if hash value of text matches the hash value of pattern then compare that window with pattern
            if(t == p)
            {
                for(j = 0; j < m; ++j)
                {
                    if(pattern.charAt(j) != text.charAt(i + j))
                        break;
                }
                if(j == m)
                    ans.add(i);
            }
            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if(i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
 
            // We might get negative value of t, convert it to positive by adding q to it
            if(t < 0)
                t = (t + q); 
            }
        }
        for(i = 0; i < ans.size(); ++i)
            System.out.println(ans.get(i));
    }
}