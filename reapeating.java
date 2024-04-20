import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
 public class Repeating{
 public static void main(Strings[] args){
       int n=10;
   int arr[] = {2,2,3,4,5,6,3,4,4,5,2};
   findrepeat(arr[]);}}
   static void findrepeat(int arr[]){
     HashMap<Integer,Integer> eleC = new HashMap<>();
     for(int i: arr){
       if(eleC.get(i) == null) eleC.put(i,1);
       else eleC.put(i,eleC.get(i)+1);
     }
     System.out.print("The repeating number are:");
     for(Entry<Integer, Integer> entry : eleC.entrySet()){
       if(entry.getValue()>1){
         System.out.print(entry.getKey() + " ")
     }
   }}
