import java.util.Scanner;

public class BinarySearch {
    public static int Search(int[]arr,int n,int b){
        int s = 0;
        int e = n;
        while (s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == b ){
                return mid;
            } else if (arr[mid]>b) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int b =23;
        if(Search(arr,n,b) == 0){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element is stored in "+Search(arr,n,b));

        }
    }
}
