public class Main
{
	public static void main(String[] args) {
            int n=8;
            int arr[] = {2,3,4,2,6,7,4,6,3,2,5};
	        int v1 =12;
	        int v2 = 15;
	        int pos=4;
	        int v3 = 16;
	        System.out.println("Before adding values:");
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+ " ");
	        }
	        System.out.println();
	        insertatbeg(arr,n,v1);
	        insertatpos(arr,n,v2,pos);
	        insertatend(arr,n,v3);
	        System.out.println("After adding values:");
	        for(int i=0;i<=n;i++){
	            System.out.print(arr[i]+ " ");
	        }
	        System.out.println();
	}
	static void insertatbeg(int[] arr, int n, int value){
	    for(int i=n-1;i>=0;i--){
	        arr[i+1]=arr[i];
	    }
	    arr[0]=value;
	}
	static void insertatend(int[] arr,int n,int value){
	    arr[n]= value;
	}
	static void insertatpos(int[] arr,int n, int value, int pos){
	    for(int i=n; i>=pos;i--){
	        arr[i] =arr[i-1];
	    }
	    arr[pos-1] = value;
	}
	/* O(n) 
	Before adding values:
	2 3 4 2 6 7 4 6
	After adding values:
	12 2 3 15 4 2 6 7 16*/
}
