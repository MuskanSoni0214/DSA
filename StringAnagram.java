public class StringAnagram {

    public static boolean anagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;

        char[]s1=str1.toCharArray();
        char[]s2=str2.toCharArray();

        int count[]=new int[256];

        for(int i=0;i<str1.length();i++)
            count[s1[i]]++;

        for(int i=0;i<str1.length();i++)
            count[s2[i]]--;

        for(int i=0;i<256;i++)
            if(count[i]!=0)
                return false;

        return true;

    }

    public static void main(String[] args) {
        String str1=new String("aabcd");
        String str2=new String("bcada");
        System.out.println(anagram(str1,str2));
    }
}
