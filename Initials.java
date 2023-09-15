import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your good name :");
        String name=sc.nextLine();
        StringBuffer myInitials = new StringBuffer();
        int length = name.length();
        for(int i=0;i<length;i++)
        {
            if(Character.isUpperCase(name.charAt(i)))
            {
                myInitials.append(name.charAt(i));
            }
        }

        System.out.println(myInitials);

    }
}
