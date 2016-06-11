/*
* Author: Vicky Chen
* Date: 6/10/2016
* 
Sort an array by frequency of number in that array
*/

public class S7_SortArrayByFrequency {
  class SortNode{
    int count;
    int firstIndex;
  }
  
  class FrequencyComparator implements Comparator<Integer>{
    private Map<Integer, SortNode> countMap = null;
    FrequencyComparator(Map<Integer, SortNode> countMap){
      this.countMap = countMap;
    }
    
    @Override
    public in compare(Integer i1, Integer i2){
      SortNode n1 = countMap.get(i1);
      SortNode n2 = countMap.get(i2);
      if(n1.count >n2.count){
        return -1;
      } else if( n1.count <n2.count){
        return 1;
      } else {
        return n1.firstIndex <n2.firstIndes ? -1 : 1;
      }
    }
    
  }
  
  public void sortByFrequency(Integer arr[]){
    Map<Integer, SortNode> countMap = new HashMap<Integer, SortNode>();
    int index =0;
    for(int a: arr){
      if(countMap.containsKey(a){
        SortNode s = countMap.get(a);
        s.count++;
      } else{
        SortNode s = new SortNode();
        s.count =1;
        s.firstIndex = index;
        countMap.put(a,s);
      }
      index++;
    }
    FrequencyComparator freqComparator = new FrequencyComparator(countMap);
    Arrays.sort(arr,freqComparator);
  }
  
  public static void main(String args[]){
    Integer input[] = {5,2,8,9,9,9,2};
    S7_SortArrayByFrequency(input);
    for(int i :input){
      System.out.println(i+ " ");
    }
  }
  
}
