import java.util.Arrays;

public class QuickSort
{

    public static void quickSort(int[]arr,int l,int h)
    {
        if(l<h)
        {
            int pIdx=partition(arr,l,h);
            quickSort(arr,l,pIdx-1);
            quickSort(arr,pIdx+1,h);
        }
    }

    public static int partition(int[]arr,int l,int h)
    {
        int pivot=arr[h];
        int i= l-1;
        for(int j=l;j<h;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;

        return i;
    }

    public static void main(String[] args) {
        int[]arr={6,3,9,5,2,8};
        int l=0;
        int h=arr.length-1;
        System.out.println("Array before quick sort : "+ Arrays.toString(arr));
        quickSort(arr,l,h);
        System.out.println("Array after quick sort : "+Arrays.toString(arr));
    }
}

