public class Recurrsion {
    //Factorial
    public static int factorial(int n)
    {
        if(n<=0)
            return 1;
        return n*factorial(n-1);
    }

    //Fibonacci
    public static int fibonacci(int n)
    {
        /*if(n<=0)
        return n;*/
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void printNoDes(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        printNoDes(n-1);
    }

    public static void printNoAsc(int n)
    {
        if(n==0)
            return;
        printNoAsc(n-1);
        System.out.print(n+" ");
    }

    public static boolean isPalindrome(String str,int s,int e)
    {
        char[]strArray=str.toCharArray();

        if(s==e)
            return true;

        if(s>e)
            return true;

        if(strArray[e]!=strArray[s])
            return false;

        return isPalindrome(str,s+1,e-1);

    }

    //Sum of digits in number
    public static int sumOfDigit(int n)
    {
        if(n<10)
            return n;
        return sumOfDigit(n/10)+(n%10);
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(factorial(5));
        printNoDes(5);
        System.out.println();
        printNoAsc(5);
        System.out.println();
        //String s="aabaa";
        String s="Muskan";
        System.out.println(isPalindrome(s,0,s.length()-1));
        System.out.println("Sum of digit is " +sumOfDigit(1234));
        System.out.println("Sum of digit is " +sumOfDigit(9987));
        System.out.println("Sum of digit is " +sumOfDigit(253));

    }
}
