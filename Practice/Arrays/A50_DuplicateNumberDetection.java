/*
* Author: Vicky Chen
* Date: 6/6/2016
* Find duplicate in array of size n + 1 with elements from 1 to n in O(1) space

* Given an array of size n + 1 with elements from 1 to n.
* One element is duplicated mulitiple times.
* Find that element in O(1) space. Array cannot be changed.
* https://leetcode.com/problems/find-the-duplicate-number/
*/

public class A50_DuplicateNumberDetection {
  public int findDuplicate( int[] nums){
    if(nums.length == 0 || num.length ==1){
      return -1;
    }
    
    int slow = nums[0];
    int fast = nums[nums[0]];
    while( slow != fast){
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    
    fast = 0;
    while(slow = nums[slow]){
      slow= nums[slow];
      fast = num[fast];
    }
    
    return fast;
  }
  
  public static void main (String args[]){
    int[] input = {2,1,3,4,3};
    A50_DuplicateNumberDetection dd = new DuplicateNumberDetection();
    System.out.println( dd.findDuplicate(input) );
  }
  
}
