import java.util.*;
public class Main
{
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0; i<n;i++){
	        Set<Integer> s = new HashSet<>();
	        for(int j=0;j<n;j++){
	            if(arr[j]<arr[i]){
	                s.add(arr[j]);
	            }
	        }
	        int rank= s.size() + 1 ;
	        System.out.print(rank+ " ");
	    }/* 6
	    25 14 31 13 69 75
	    3 2 4 1 5 6  */
	}
}
