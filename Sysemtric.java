import java.util.HashMap;
public class Main{
    public static void main(String args[]){
        int arr[][] = {{1,2},{2,3},{4,2},{6,5},{2,1},{3,2}};
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        System.out.println("The Systemetric Pair are:");
        for(int i=0; i<arr.length; i++){
           int first= arr[i][0];
            int second = arr[i][1];
            if(hm.get(second) != null && hm.get(second) == first){
                System.out.print("(" + first + " "+ second  + ")");}
            else{
                    hm.put(first,second);
                }
        }/* (2 1) (3 2)    O(n)*/
    }
}
