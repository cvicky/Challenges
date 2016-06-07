/*
* Author: Vicky Chen
* Date: 6/7/2016
* 
http://www.careercup.com/question?id=4798365246160896

Given the AP :- 1 3 7 9 11 13 find the missing value "which would be 5 here". 

Conditions : 
Get an user for the length of AP sequence and make sure user provides length is above 3. 
Get the input in a single line ex:- "1 3 5 7 9 11" 
Provide the solution in O(n) or less if you can.
*/

public class B1_ArithmeticProgressionSearch {
  public int search (int input[]){
    int low =0;
    int high = input.length-1;
    int arithprog = (input[high] - input[low])/(input.length);//find the pattern
    //this is the meaning of arithmetic progression
    //each index value has a difference of +arithprog between them
    int middle = -1;
    while(low <= high){
      middle = (low + high)/2; //middle index
      if(input[middle] == input[0] + (middle)*arithprog) {
          low = middle +1;
      } else if( (input[middle] > input[0] + (middle)*arithprog ) &&
                  input[middle-1] == input[0] +(middle-1)*arithprog) {
              return input[0] + (middle)*arithprog;                
      } else {
          high = middle-1;
      }
    }
    
    return -1;
    } //end search()
    
    public static void main (String args[]){
      int input[] = {1,7,10,13,16,19,22};
      B1_ArithmeticProgressionSearch aps = new B1_ArithmeticProgressionSearch();
      System.out.println( aps.search(input) );
    }
}
