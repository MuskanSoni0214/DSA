import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[]arr,int n)
    {
        int mx=arr[0];

        for(int i=1;i<n;i++)
            if(arr[i]>mx)
                mx=arr[i];

        for(int e=1;mx/e>0;e=e*10)
            countingSort(arr,n,e);
    }

    public static void countingSort(int[]arr,int n,int e)
    {
        int count[]=new int[10];
        int output[]=new int[n];

        for(int i=0;i<10;i++)
            count[i]=0;

        for(int i=0;i<n;i++)
            count[(arr[i]/e)%10]++;

        for(int i=1;i<10;i++)
            count[i]=count[i]+count[i-1];

        for(int i=n-1;i>=0;i--)
        {
            output[count[(arr[i]/e)%10]-1]=arr[i];
            count[(arr[i]/e)%10]--;
        }

        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }

    public static void main(String[] args) {
        int[]arr={319,212,6,8,100,50};
        System.out.println("Array before Radix Sort : "+ Arrays.toString(arr));
        radixSort(arr,arr.length);
        System.out.println("Array after Radix Sort : "+Arrays.toString(arr));
    }
}
