/*
* Author: Vicky Chen
* Date: 6/8/2016
*
Conut number of set bits in an integer
*/

public class B4_CountBits {
  public CountBits(){
    preCalculate();
  }
  
  public in countBits(int num){
    int count =0l
    while(num >0){
      num &= num-1; //when & you keep all the 1 and 0 in the same places, merging
      //what doesn num-1 do?
      count++;
      
    }
    return count;
  }
  
  private int count[] = new int [256];
  
  void preCalculate(){
    for(int i =0; i<256; i++){
      count[i] = countBits(i); //what does this do?
    }
  }
  
  public int counBitsFaster(int num){
    //get 8 bits at a time and check count from count array
    int total =0;
    int mask - (1<<8) -1;
    for(int i=0; i<4; i++){
      total+=count[num & mask];
      num = num>>>8; 
      //unsigned 0 extension to right, instead of signed extension with 1s
    }
    return total;
  }
  
  public int countBitsEvenFast( int x){
    //count bits of each 2-bit chunk
    x=x-((x >> 1) & (0x55555555);
    //count bits of each 4-bit chunk
    x=(x & 0x33333333) + ((x>>2) & 0x33333333);
    //count bits of each 8-bit chunk
    x= x+(x >> 4);
    //mask out junk
    x&= 0xF0F0F0F;
    //add all four 8-bit chunks
    return (x*0x01010101) >> 24;
    
  }
  
  public static void main(String args[]){
    B4_CountBits cb = new B4_CountBits();
    System.out.println(cb.countBits(3636363) );
    System.out.println(cb.countBitsFaster(3636363) );
    System.out.println(cb.countBitsEvenFaster(3636363) );
    
  }
}
