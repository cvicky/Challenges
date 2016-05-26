// 344. Reverse String

/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

public class Solution {
    public String reverseString(String s) {
        String rev = "";
        for(int i = s.length()-1; i>-1; i--){
            rev = rev + s.charAt(i);
        }        
        return rev;
    }
}
