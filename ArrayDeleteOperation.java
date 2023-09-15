import java.util.Arrays;

public class ArrayDeleteOperation {
    public static int deletion(int[]arr,int n,int x)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
                break;
        }
        if(i==n)
            return n;

        for(int j=0;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void delete(int[]arr,int pos)
    {
        for(int i=pos-1;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
    public static void main(String[] args) {
        int arr[]={3,8,12,5,6};
//        int ans=deletion(arr,n,x);
        System.out.println("Array before deletion of element in 3rd position : "+Arrays.toString(arr));
       delete(arr,3);
        System.out.println("Array after deletion of element in 3rd position : "+Arrays.toString(arr));


    }
}
