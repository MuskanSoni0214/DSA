import java.util.HashSet;

public class CountDistinctEle {
    public static int distinctCount(int[]arr)
    {
        HashSet<Integer>h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }
        return h.size();
    }
    public static void main(String[] args) {
         int[]arr= {15,12,13,12,13,13,18};
        System.out.println(distinctCount(arr));
    }
}
