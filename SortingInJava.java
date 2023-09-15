
import java.util.Arrays;
//import java.util.Collections;
import java.util.Comparator;

class Point
{
    int x,y;
    Point(int i,int j)
    {
        x=i;
        y=j;
    }
}

class MySort implements Comparator<Point>
{
    @Override
    public int compare(Point a, Point b) {
        return (a.x-b.x);
    }
}

public class SortingInJava {
    public static void main(String[] args) {
//       Integer[]arr={3,2,6,7,4,53};
//        System.out.println("Array before sorting : "+ Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Array after sorting : "+Arrays.toString(arr));
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("Array after reverse-order or decreasing order sorting "+Arrays.toString(arr));
//        Arrays.sort(arr,2,arr.length);
//        System.out.println("Array after sorting from index 2 to last index "+Arrays.toString(arr));

        Point[]arr={new Point(10,20),
                    new Point(3,12),
                    new Point(5,7)};

        Arrays.sort(arr,new MySort());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].x+" "+arr[i].y);
        }

    }
}
