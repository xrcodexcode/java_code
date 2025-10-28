public class p6
{
    int i,j,n=5;
    void logic()
    {
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
             System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p6 ob = new p6();
        ob.logic();
    }
}