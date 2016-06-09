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
