import java.util.Arrays;

public class LeftRotateTheArray {
    public static void lRotate(int[]arr)
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Before Left rotation : "+ Arrays.toString(arr));
        lRotate(arr);
        System.out.println("After Left rotation : "+ Arrays.toString(arr));
    }
}
