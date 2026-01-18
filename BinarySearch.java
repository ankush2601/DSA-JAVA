import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Which missing element you want to get:");
        int k=sc.nextInt();

        System.out.println(k+"th missing element is: "+findKthMissingElement(arr,k));

    }
    public static int findKthMissingElement(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high+1+k;
    }

    
}