public class BinarySearch {

    public static int binarySearch(int[]arr,int x)
    {
        int s=0;
        int e=arr.length-1;


        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                e=mid-1;
            else
                s=mid+1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[]arr,int s,int e,int x)
    {
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            recursiveBinarySearch(arr,s,mid-1,x);
        else
            recursiveBinarySearch(arr,mid+1,e,x);

        return -1;
    }

    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,60,70};
        int x=20;
        int ans=binarySearch(arr,x);
        System.out.println("Iterative binary search : "+ans);
        int ans2=recursiveBinarySearch(arr,0,arr.length-1,x);
        System.out.println("Recursive binary search : "+ans2);


    }
}
