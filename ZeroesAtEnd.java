import java.util.Arrays;

public class ZeroesAtEnd {

    public static void moveToEnd(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                swap(arr[i],arr[count]);
                count++;
            }
        }
    }
    public static void swap(int e1, int e2)
    {
        int temp=e1;
        e1=e2;
        e2=temp;
    }

    public static void main(String[] args) {
        int[]arr1={8,5,0,10,0,20};
        int[]arr2={0,0,0,10,0};
        int[]arr3={10,20};
        System.out.println("Array 1 before moving zeroes at the end :"+ Arrays.toString(arr1));
        moveToEnd(arr1);
        System.out.println("Array 1 after moving zeroes at the end :"+ Arrays.toString(arr1));

    }
}
