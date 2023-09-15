public class MergeSort {
    public static void main(String[] args) {
        int [] arr={6,3,9,5,2,8};
        int size=arr.length;
        System.out.print("Array before sorting : ");
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        divide(arr,0,size-1);
        System.out.print("Array after sorting : ");
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void divide(int[]arr,int s,int e){
        if(s>=e)
        {
            return;
        }
        int m=s+(e-s)/2;
        divide(arr,s,m);
        divide(arr,m+1,e);
        conquer(arr,s,m,e);
    }
    public static void conquer(int[]arr,int s,int m,int e)
    {
        int mergerd[]=new int[e-s+1];
        int i1=s;
        int i2=m+1;
        int x=0;
        while(i1<=m && i2<=e)
        {
         if(arr[i1]<=arr[i2])
         {
             mergerd[x++]=arr[i1++];
         }
         else
         {
             mergerd[x++]=arr[i2++];
         }
        }
        while(i1<=m)
        {
            mergerd[x++]=arr[i1++];
        }
        while(i2<=e)
        {
            mergerd[x++]=arr[i2++];
        }
        for(int i=0,j=s;i<mergerd.length;i++,j++)
        {
            arr[j]=mergerd[i];
        }
    }
}
