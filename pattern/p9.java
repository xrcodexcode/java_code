public class p9
{
    int i,j,n;
    void logic()
    {
        n=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
             {
                 System.out.print(n+" ");
                 n++;
             }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p9 ob = new p9();
        ob.logic();
    }
}