import java.util.Arrays;

public class HeapSort {

    public static void maxHeapify(int[]arr,int n,int i)
    {
        int largest=i,left=2*i+1,right=2*i+2;

        if(left<n && arr[left]>arr[largest])
            largest=left;

        if(right<n && arr[right]>arr[largest])
            largest=right;

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            maxHeapify(arr,n,largest);
        }
    }
    public static void buildHeap(int[]arr,int n)
    {
        for(int i=(n-2)/2;i>=0;i--)
        {
            maxHeapify(arr,n,i);
        }
    }
    public static void heapSort(int[]arr,int n)
    {
        buildHeap(arr,n);
        for(int i=n;i>=1;i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            maxHeapify(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int[]arr={10,15,50,4,20};
        int n=arr.length-1;
        System.out.println("Array before Sorting using HeapSort : "+ Arrays.toString(arr));
        heapSort(arr,n);
        System.out.println("Array after Sorting using HeapSort : "+Arrays.toString(arr));

    }
}
