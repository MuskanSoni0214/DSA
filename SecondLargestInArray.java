public class SecondLargestInArray {
    public static int efficientSecondLargest(int[]arr)
    {
        int max=0;
        int secondMax=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[max]) {
                secondMax=max;
                max = i;
            }
            else if(arr[i]!=arr[max])
            {
                if(secondMax==-1 || arr[i]>arr[secondMax])
                    secondMax=i;
            }
        }
        return secondMax;
    }
    public static int secondLargest(int[]arr)
    {
        int max=0;
        int secondMax=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]>arr[i]) {
                max = i + 1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[max])
                if(arr[i]>arr[secondMax])
                    secondMax=i;


        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[]arr={10,5,8,20,12};
//        int ans=secondLargest(arr);
        int ans=efficientSecondLargest(arr);
        System.out.println(ans);
    }
}
