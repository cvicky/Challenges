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


//OR USE COLLECTIONS WHICH HAS A REVERSE METHOD

/*
import java.util.*;
import java.io.*;

public class Solution {
    public String reverseString(String s) {
        String rev = "";
        char[] sArray = s.toCharArray();
        List<Character> lls = new LinkedList<>();
        for(char c : sArray){
            lls.add(c);
        }
        Collections.reverse(lls);
        ListIterator li = lls.listIterator();
        while(li.hasNext() ) {
            rev = rev+li.next();
        }
        return rev;
    }
}

*/
