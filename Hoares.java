import java.util.Arrays;

public class Hoares {

    public static int partition(int[]arr,int l,int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

        public static void main(String[] args) {
        int[]arr={5,3,8,4,2,7,1,10};
        int l=0;
        int h=arr.length-1;
            System.out.println("Array before partition : "+Arrays.toString(arr));
            int ans=partition(arr,l,h);
            System.out.println("Array after partition : "+Arrays.toString(arr));
    }
}
