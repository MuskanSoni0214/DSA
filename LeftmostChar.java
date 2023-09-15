public class LeftmostChar {

    public static int leftmostChar(String s)
    {
        int res=Integer.MAX_VALUE;

        int[]f=new int[256];
        for(int i=0;i<f.length;i++)
        {
            f[i]=-1;
        }

        char[]sa=s.toCharArray();

        for(int i=0;i<sa.length;i++)
        {
            if(f[sa[i]]==-1)
                f[sa[i]]=i;
            else
                res=Math.min(res,f[sa[i]]);
        }
        return (res==Integer.MAX_VALUE)?-1:res;

    }

    public static void main(String[] args) {
        String s="Muska-Chuska";
        System.out.println(leftmostChar(s));

    }
}
