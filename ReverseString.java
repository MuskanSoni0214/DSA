public class ReverseString {
    public static void main(String[] args) {
        String str="Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String [] tokens = str.split("\\s");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i< tokens.length;i++)
        {
            sb.insert(0,tokens[i]);
            if(i< tokens.length-1)
            {
                sb.insert(0," ");
            }
        }

        System.out.println("Original String : "+str);

        String strReverse = sb.toString();
        System.out.println("Reversed String : "+strReverse);

    }
}
