import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n;i++){
	        arr[i]= sc.nextInt();
	    }
	    Arrays.sort(arr);
	    if(n%2== 0){
	        int ind1= (n/2) -1;
	        int ind2 = n/2;
	        System.out.print((double)(arr[ind1] + arr[ind2])/2);
	    }
	    else{
	        System.out.print(arr[(n/2)]);
	    }
}}
/* 4
2 7 1 5
3.5 */
