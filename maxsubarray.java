import java.util.*;

class maxsubarray{
    public static int maxSubArray(int[] nums){
        int n= nums.length;
        int max=Integer.MIN_VALUE,sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            sum+= nums[i];
            arr[i]=sum;
            max=Math.max(sum,max);
            if(sum<0) sum=0;

        }
        
        return max;
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
        int x;
       x=maxSubArray(arr);
       System.out.print(x);
    }
}