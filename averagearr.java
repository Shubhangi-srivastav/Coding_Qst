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
	    double sum=0;
	    for(int i=0; i<n ; i++){
	        sum+= (double) arr[i];
	    }
	    System.out.print(double(sum/n));
	}
}
/* 5
1 2 3 4 5
3 */
