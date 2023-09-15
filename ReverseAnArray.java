import java.util.Arrays;

public class ReverseAnArray {
    public static void reverse(int[]arr)
    {
        int i=0,j=arr.length-1;
      while(i<j)
      {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
      }
    }
    public static void main(String[] args) {
        int arr[]={30,7,6,5,10};
        System.out.println("Array before reverse : "+ Arrays.toString(arr));
       reverse(arr);
        System.out.println("Array after reverse : "+Arrays.toString(arr));

    }
}
