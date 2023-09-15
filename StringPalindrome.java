public class StringPalindrome {
    public static void main(String[] args) {
        String palindrome="ABLE was I ere I saw Elba";
        int len=palindrome.length();
        char[]tempCharArray=new char[len];
        char[]charArray=new char[len];
        palindrome.getChars(0,len,tempCharArray,0);
        for(int i=0;i<len;i++)
        {
            charArray[i]=tempCharArray[len-i-1];
        }
        String reversePalindrome = new String(charArray);

        System.out.println("Original String : "+palindrome);
        System.out.println("Reversed String : "+reversePalindrome);

        System.out.println("Another Method to Reverse String using StringBuilder");
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println("Original String : "+palindrome);
        System.out.println("Reversed String : "+sb);
    }
}
