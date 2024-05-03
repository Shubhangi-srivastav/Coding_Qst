import java.util.*;
public class Main
{
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
	       int[] arr = new int[n];
	       for(int i=0;i<n;i++){
	           arr[i] = sc.nextInt();
	       }
	       int m = arr.length;
	       int brr[] = new int[m];
	       for(int i=0;i<m;i++){
	           brr[i]=arr[i];
	       }
	       Arrays.sort(brr);
	       HashMap<Integer, Integer> rankMap = new HashMap<>();
	       for(int i=0;i<m;i++){
	           rankMap.put(brr[i],i+1);
	       }
	       for(int i=0;i<m;i++){
	           System.out.print(rankMap.get(arr[i]) + " ");
	       }
	}  /* 6 
	20 15 26 2 98 26
	4 3 5 1 6 2
	*/
}
