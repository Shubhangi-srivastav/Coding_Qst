import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n;i++){
		    arr[i]= sc.nextInt();
		}
		int k=sc.nextInt();
		Blockswap(arr,0,k,n);
		System.out.print("After rotating:");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}}
	public static void Blockswap(int[] arr,int i, int k,int n){
		    if(k==0 || k==n){
		        return;
		    }
		    if(k == n-k){
		        swaps(arr,i,n-k+i,k);
		        return;
		    }
		    else if(k<n-k){
		        swaps(arr,i,n-k+i,k);
		        Blockswap(arr,i,k,n-k);
		    }
		    else{
		        swaps(arr,i,k,n-k);
		        Blockswap(arr,n-k+i,2*k-n,k);
		    }
		}
	public static void swaps(int[] arr,int a, int b, int k){
		    for(int i=0;i<k;i++){
		        int temp = arr[a+i];
		        arr[a+i] = arr[b+i];
		        arr[b+i] = temp;
		    }
		}
	/* 5
	2 3 4 5 6
	2 
	after rotating: 4 5 6 2 3 */
}
