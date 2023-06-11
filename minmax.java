import java.util.Arrays;
import java.util.Scanner;
class minmax {
    public int min;
    public int max;
    
}
class Main{
    static minmax getMinMax(int arr[],int n){
        minmax Minmax= new minmax();
        Arrays.sort(arr);
        Minmax.min=arr[0];
        Minmax.max=arr[n-1];
        return Minmax;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr_size;
        System.out.println("Enter the arraysize");
        arr_size=sc.nextInt();
    
        int arr[]=new int[arr_size];
        System.out.println("Enter the array");
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        minmax Minmax= getMinMax(arr, arr_size);
        System.out.println("MInimum element is" + Minmax.min);
        System.out.println("Maximum element is" + Minmax.max);
    }
}