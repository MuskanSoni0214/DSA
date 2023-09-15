import java.util.Arrays;

public class InsertionInArray {
    public static void insert(int[]arr,int pos, int val)
    {
        for(int i=arr.length-1;i>=pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=val;
    }

    public static void main(String[] args) {
        int[]arr=new int[5];
        arr[0]=2;
        arr[1]=5;
        arr[2]=198;
        System.out.println("Array before inserting given value"+Arrays.toString(arr));
        System.out.println(arr.length);
        insert(arr,2,56);
        System.out.println("Array after inserting given value"+Arrays.toString(arr));

    }
}
