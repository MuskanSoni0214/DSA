import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[]arr)
    {
        int small;
        for(int i=0;i<arr.length-1;i++)
        {
            small=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[small])
                    small=j;
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[]arr={10,5,8,20,2,8};
        System.out.println("Array before sorting : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
