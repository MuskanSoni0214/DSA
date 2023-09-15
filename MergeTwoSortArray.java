import java.util.Arrays;

public class MergeTwoSortArray {
    public static void merge(int[]a,int[]b,int n,int m)
    {
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<n)
            System.out.print(a[i++]+" ");

        while(j<m)
            System.out.print(a[j++]+" ");
    }
    public static void main(String[] args) {
        int[]a={10,15,20,40};
        int[]b={5,6,6,10,15};
        int n=a.length-1;
        int m=b.length-1;

        System.out.println("Elements of array a : "+Arrays.toString(a));
        System.out.println("Elements of array b : "+Arrays.toString(b));
        System.out.println("Combine elements of array a and b : ");
        merge(a,b,n,m);


    }
}
