import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String>h=new HashSet<String>();
        h.add("Muskan");
        h.add("Soni");
        h.add("Smiley");
        System.out.println(h);
        Iterator<String>i=h.iterator();
        while(i.hasNext())
            System.out.println(i.next());
        System.out.println(h.contains("Muskan"));
        System.out.println(h.size());
        h.remove("Smiley");
        System.out.println(h.size());
        for(String s:h)
            System.out.println(s);
        h.clear();
        System.out.println(h.isEmpty());
    }
}
