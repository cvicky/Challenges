/* 
* Author: Vicky Chen
* Date: 6/5/2016
* Given two numbers in form array, add them
*/

public class A1_ArrayAddition {
    
  public int[] add(int arr1[], int arr2[]){
    int len = Math.max(arr1.length, arr2.length);
    int[] result = new int []; //save the sum in a result array
    int carry= 0;
    int i = arr1.length-1; //start at the ones place
    int j = arr2.legnth-1;
    int subresult = 0;
    len--; //should be -1 b/c it's the ones index in result array
    
    //start the while loop for adding
    while( i>=0 && j>=0){
      subresult = arr1[i--] + arr2[j--] + carry;
      carry = subresult/10; //if numbers add up to more than 10, carry the one
      result[len--] = subresult%10; //gets the ones place of 2-digit number sum
    }
    
    //if arr1 is bigger number than arr2
    while(i>=0){
      subresult = arr1[i--] + carry;
      carry = subresult/10;
      result[len--] = subresult%10;
    }
    
    //if arr2 is bigger number than arr1
    while(j>=0){
      subresult = arr2[j--] + carry;
      carry = subresult/10;
      result[len--] = subresult%10;
    }
    
  }
}
