import java.util.*;
public class Main
{
	public static void main(String[] args) {  /* O(n) */
           int n=9;
           int[] arr={4,5,6,7,8,4,6,3,5,3,4};
	       duplicate(arr,n);
	}
	static void duplicate(int arr[], int n){
	    HashMap<Integer, Integer> mp = new HashMap<>();
	    for(int i=0; i<n ; i++){
	        if(!mp.containsKey(arr[i])){
	            System.out.print(arr[i] + " ");
	            mp.put(arr[i],1);
	        }
	    }
	}
}
