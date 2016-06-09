/*
* Author: Vicky Chen
* Date: 6/8/2016
*
Given an integer and number k, right or left rotate bits in this interger by k

*/

public class B2_BitRotation {
  public byte rotateLeft( byte num, int d){
    return (byte) ( (num << k) | (num >>> (8-k)) );
  }
  
  public static void main(String args[]){
    B2_BitRotation br = new B2_BitRotation();
    System.out.println(br.rotateLeft( (byte)28,2) );
  }

}


/* 
difference between >> and >>>

>> is arithmetic shift right, >>> is logical shift right.

In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.

For example: -2 represented in 8 bits would be 11111110 (because the most significant bit has negative weight). Shifting it right one bit using arithmetic shift would give you 11111111, or -1. Logical right shift, however, does not care that the value could possibly represent a number; it simply moves everything to the right and fills in from the left with 0s. Shifting our -2 right one bit using logical shift would give 01111111.
*/

