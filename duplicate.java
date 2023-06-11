import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    public static boolean containDup(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] shubhangi){
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean x;
       x=containDup(arr);
       System.out.println(x);
    }
    
}
