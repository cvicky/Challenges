/* 
* Author: Vicky Chen
* Date: 6/7/2016

Regular binary search
*/

public class B2_BinarySearch {
  public int search( int input[], int search) {
    int low = 0;
    int high = input.length-1;
    int middle = 0;
    while( low <= high) {
      middle = (low + high)/2; //find the middle index
      if( input[middle] == search) {
        return middle;
      } else if ( input[middle] < search){ //less than, so look on right half
          low = middle+1;
      } else { //input[middle] > search, mid num is greater so look on left half
        high =  middle-1; 
      }
    
    return -1; //not found
  }
  
  public static void main (String args[]) {
    B2_BinarySearch bs = new B2_BinarySearch();
    int arr1 = {1,2,4,5,7,8};
    System.out.println(bs.search( arr1, -1) );
    System.out.pringln(bs.search( arr1, 1) );
    System.out.println(bs.search( arr1, 8) );
    System.out.println(bs.search( arr1, 2) );
  }
}
