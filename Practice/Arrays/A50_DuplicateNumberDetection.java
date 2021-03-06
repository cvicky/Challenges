/*
* Author: Vicky Chen
* Date: 6/6/2016
* Find duplicate in array of size n + 1 with elements from 1 to n in O(1) space

* Given an array of size n + 1 with elements from 1 to n.
* One element is duplicated mulitiple times.
* Find that element in O(1) space. Array cannot be changed.
* https://leetcode.com/problems/find-the-duplicate-number/
*/

//array can't be changed, means that array can't be sorted

/*
O(1) space: memory required by the algorithm is constant, 
i.e. does not depend on the size of the input.

O(n) space: memory required by the algorithm has (in the worst case)
the same order of magnitude as the size of the input.
*/
public class A50_DuplicateNumberDetection {
  public int findDuplicate( int[] nums){
    //base case, no duplicates possible
    if(nums.length == 0 || nums.length ==1){
      return -1;
    }
    
    int slow = nums[0];
    int fast = nums[nums[0]];
    while( slow != fast){
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    
    //fast is the duplicate number b/c slow is the one that is kept 
    //to be checked against fast
    
    fast = 0;
    while(slow != fast){
      slow = nums[slow];
      fast = nums[fast];
    }
    
    return fast;
  }
  
  public static void main (String args[]){
    int[] input = {2,1,3,4,3};
    A50_DuplicateNumberDetection dd = new A50_DuplicateNumberDetection();
    System.out.println( dd.findDuplicate(input) );
  }
  
}

/*explanation of this solution:
http://keithschwarz.com/interesting/code/?dir=find-duplicate
*/

//or bit manipulation
/*
We can count the sum of each 32 bits separately for the given array
(stored in "b" variable) and for the array [1, 2, 3, ..., n] 
(stored in "a" variable). If "b" is greater than "a", it means
that duplicated number has 1 at the current bit position 
(otherwise, "b" couldn't be greater than "a"). This way we 
retrieve the answer bit by bit:
*/

/*
public int findDuplicate(int[] nums) {
    int n = nums.length-1, res = 0;
    for (int p = 0; p < 32; ++ p) {
        int bit = (1 << p), a = 0, b = 0;
        for (int i = 0; i <= n; ++ i) {
            ++a;
            if ((nums[i] & bit) > 0) ++b;
        }
        if (b > a) res += bit;
    }
    return res;
}

*/
