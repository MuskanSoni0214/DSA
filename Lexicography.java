public class Lexicography {

public static int fact(int n)
{
    if(n==0)
        return 0;
    if(n==1)
        return 1;

    return n*fact(n-1);
}

public static int lexRank(String str)
{
    int rank=0;
    int res=1;
    int n=str.length();
    int mul=fact(n);
    int[]count=new int[256];
   char[]s=str.toCharArray();

    for(int i=0;i<s.length;i++)
        count[s[i]]++;

    for(int i=1;i<256;i++)
        count[i]=count[i]+count[i-1];

    for(int i=0;i<n;i++) {
        mul = mul / (n - i);
        rank = rank + count[s[i] - 1] * mul;

        for (int j = s[i];j<256;j++)
            count[j]--;
    }
    return rank;
}

    public static void main(String[] args) {
        String str="BAC";
        System.out.println(lexRank(str));
    }
}
