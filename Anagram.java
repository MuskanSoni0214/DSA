
public class Anagram {

    public static boolean areAnagrams(String s1, String s2)
    {
        String c1=removeJunk(s1);
        String c2=removeJunk(s2);

        c1=c1.toLowerCase();
        c2=c2.toLowerCase();

        c1=sort(c1);
        c2=sort(c2);

        return c1.equals(c2);

    }
    protected  static String removeJunk(String string)
    {
        int i, len=string.length();
        StringBuilder dest = new StringBuilder(len);
        char c;
        for(i=(len-1);i>=0;i--)
        {
            c=string.charAt(i);
            if(Character.isLetter(c))
            {
                dest.append(c);
            }
        }
        return  dest.toString();
    }

    protected static String sort(String string)
    {
        char[] charArray = string.toCharArray();

        java.util.Arrays.sort(charArray);

        return new String(charArray);
    }
    public static void main(String[] args) {
        String str1= "Cosmo and Laine";
        String str2="Maid, clean soon!";

        System.out.println();
        System.out.println("Testing whether the string are anagrams: ");
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
        System.out.println();
        
        if(areAnagrams(str1,str2))
        {
            System.out.println("They are anagrams.");
        }
        else
        {
            System.out.println("They are not anagrams.");
        }
    }
}
