public class BubbleSort {
    public static void main(String[] args)
    {
        int arr[]={8,3,10,8,3,7};
        int arr1[]={1,2,3,4,5,6};
        System.out.print("Array before sorting : ");
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        bubbleSort(arr1);
        System.out.print("Array after sorting : ");
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[]arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                   swapped=true;
                }
            }
            if(swapped==false)
                System.out.println("Array is already Sorted.");
                break;
        }
    }
}
