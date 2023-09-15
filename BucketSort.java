import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(int[]arr,int k)
    {
        int n=arr.length;
        int max_val=arr[0];

        for(int i=1;i<n;i++)
            max_val=Math.max(max_val,arr[i]);
        max_val++;

        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<k;i++)
            bkt.add(new ArrayList<Integer>());

        for(int i=0;i<n;i++)
        {
            int bi=(k*arr[i])/max_val;
            bkt.get(bi).add(arr[i]);
        }

        for(int i=0;i<k;i++)
            Collections.sort(bkt.get(i));

        int index=0;

        for(int i=0;i<k;i++)
            for(int j=0;j<bkt.get(i).size();j++)
                arr[index++]=bkt.get(i).get(j);

    }

    public static void main(String[] args) {
        int[]arr={30,40,10,80,5,12,70};
        int k=4;
        System.out.println("Array before bucket sort : "+ Arrays.toString(arr));
        bucketSort(arr,4);
        System.out.println("Array after bucket sort : "+Arrays.toString(arr));

    }
}
