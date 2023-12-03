public class HeapSort {
    public static void sort(int []arr){
        int N = arr.length;
        for(int i = (N/2)-1;i>=0;i--){
            heapify(arr,N,i);
        }
        for (int i = N-1;i>=0;i--){
            int temp = arr[0];
             arr[0]  = arr[i];
             arr[i] = temp;
             heapify(arr,i,0);
        }
    }
    public static void heapify(int []arr,int N,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<N&&arr[l]>arr[largest]){
            largest = l;
        }
        if(r<N&&arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,N,largest);
        }

    }
    public static void main(String[] args) {
        int []arr = {7,5,6,8,1,6};
        int N = arr.length;
        sort(arr);
        System.out.println("Sorted Array");
        for(int i = 0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
}