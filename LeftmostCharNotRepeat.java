public class LeftmostCharNotRepeat {

    public static int leftmostNotRepeat(String s)
    {
        int res=Integer.MAX_VALUE;

        int[]f=new int[256];
        for(int i=0;i<f.length;i++)
        {
            f[i]=-1;
        }

        char[]str=s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(f[str[i]]==-1)
                f[str[i]]=i;
            else
                f[str[i]]=-2;
        }

        for(int i=0;i<256;i++)
        {
            if(f[i]>=0)
                res=Math.min(res,f[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(leftmostNotRepeat(s));
    }
}
