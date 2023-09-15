public class TowerOfHanoi {
    public static void tOH(int n, char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        tOH(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        tOH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        tOH(3,'A','B','C');
    }
}
