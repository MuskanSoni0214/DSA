import java.util.Arrays;

public class PartitionOfArray {

    public static void lomuto(int[]arr,int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++)
        {
            if(arr[j]>pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            int temp=arr[i];
            arr[i]=pivot;
            pivot=temp;

        }
    }

    public static void main(String[] args) {
        int arr[]={3,8,6,12,10,7};
        System.out.println("Array before partitioning : "+ Arrays.toString(arr));
        int l=0;
        int h=arr.length-1;
        lomuto(arr,l,h);
        System.out.println("Array after partitioning : "+Arrays.toString(arr));
    }
}
