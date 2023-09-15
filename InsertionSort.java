import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={50,20,40,60,10,30};
        System.out.println("Array before sorting using insertion sort : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting using insertion sort : "+Arrays.toString(arr));
    }
}
