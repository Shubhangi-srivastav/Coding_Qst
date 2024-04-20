import java.util.*;
public class Main{
	public static void main(String[] args) {
	    int n=8;
	    int[] arr = {2,3,3,2,5,6,7,7};
	    for(int i=0;i<n; i++){
	        boolean check = false;
	        for(int j=0;j<n; j++){
	           if(i !=j && arr[i] == arr[j]){
	               check= true;
	               break;}}
           if(!check) System.out.print(arr[i] + " ");
	           
	    }
	}
}
