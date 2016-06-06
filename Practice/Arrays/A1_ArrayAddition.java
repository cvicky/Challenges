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
    //if carry digit isn't 0 when reach here,
    //then you have an additional numbers place, need to make a new result[]
    if(carry !=0){
        int[] newResult = new int[result.length+1];
        //fill in the newResult[] with result values, backwards
        for(int index = newResult.length-1; index > 0; index--){
            newResult[index] = result[index];
        }
        //the for loops stops when index= 0 in newResult, which is the carry
        newResult[0] = carry;
        return newResult;
        
    }//end iff
    
    return result; //didn't need to make a newResult []
  }
  
  public static void main (String args[]){
      int arr1[] = {9,9,9,9,9,9,9};
      int arr2[] = {1,2,3,4,5,6};
      A1_ArrayAddition aa = new ArrayAddition();
      int result[] = aa.add(arr1, arr2);
      
      //print out the result[]
      for(int i=0; i< result.length; i++){
          System.out.print(""+ result[i]);
      }
  }
}
