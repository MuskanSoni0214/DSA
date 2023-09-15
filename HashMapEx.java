import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<String,Integer>();
        m.put("Muskan",2);
        m.put("Daizy",15);
        m.put("Smiley",5);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer>e:m.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
        if(m.containsKey("Smiley"))
            System.out.println("yes");
        else
            System.out.println("NO");
        m.remove("Smiley");
        System.out.println(m.size());
        if(m.containsValue(15))
            System.out.println("yes");
        else
            System.out.println("NO");
        System.out.println(m.get("Daizy"));
        System.out.println(m.get("Smiley"));
    }
    }

