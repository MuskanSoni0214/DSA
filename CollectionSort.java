import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pointt
{
    int x,y;
    Pointt(int a,int b)
    {
        x=a;
        y=b;
    }
}
class MyCollectionSort implements Comparator<Pointt>
{

    @Override
    public int compare(Pointt a, Pointt b) {
        return (a.x-b.x);
    }
}class MyCollectionSortReverse implements Comparator<Pointt>
{

    @Override
    public int compare(Pointt a, Pointt b) {
        return (b.x-a.x);
    }
}

public class CollectionSort {
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(5);
//        arr.add(10);
//        arr.add(7);
//        arr.add(20);
//
//        System.out.println("Arraylist before sorting : "+arr);
//        Collections.sort(arr);
//        System.out.println("ArrayList after Sorting : "+arr);
//        Collections.sort(arr,Collections.reverseOrder());
//        System.out.println("ArrayList after reverse Sorting : "+arr);

        ArrayList<Pointt>a=new ArrayList<>();
        a.add(new Pointt(10,20));
        a.add(new Pointt(3,12));
        a.add(new Pointt(5,7));
        System.out.println("ArrayList before sorting : ");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).x+" "+a.get(i).y);
        }
        Collections.sort(a,new MyCollectionSort());
        System.out.println("ArrayList after sorting : ");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).x+" "+a.get(i).y);
        }
        Collections.sort(a,new MyCollectionSortReverse());
        System.out.println("ArrayList after sorting in reverse order: ");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).x+" "+a.get(i).y);
        }
    }
}
