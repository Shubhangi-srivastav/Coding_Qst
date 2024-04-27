import java.util.*;
public class SortByFrequency{
   public static void main(Strings args[]){
     int[] array = {4,4,4,2,2,1,1,6,5,5,3,3};
     // create hashmap to store frequency of element
     Map<Integer, Integer> freqmp = new HashMap<>();
     for(int num : array){
       freqmp.put(num,freqmp.getOrDefault(num,0)+1);
     }
     // create custom comparator to sort by frequency
     Comparator<Integer> freqComparator = (num1,num2)-> {
       int freqCom = freqmp.get(num2).compareTo(freqmp.get(num1));
       if(freqCom==0){
         return num1.compareTo(num2);
       }
       return freqCom;
     }
       //convert the array to list and compare with custom comparator to sort by frequency
    List<Integer> ls =new ArrayList<>();
     for(int num : array){
       ls.add(num);
     }
     Collection.sort(ls , freqComparator);
     // converted sorted list back to array
    int index = 0;
   for(int num : ls){
     array[index++]=num ;
   }
     System.out.print("Ths sorted array according to frequency :"+ Arrays.toString(array));
}}
