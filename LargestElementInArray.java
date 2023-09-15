public class LargestElementInArray {
    public static int largestElement(int[]arr)
    {
        int maxIndex=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]>arr[i])
                maxIndex=i+1;
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int[]arr={10,5,20,8,40};
        int ans=largestElement(arr);
        System.out.println(ans);
    }
}
