public class p7
{
    int i,j;
    void logic()
    {
       for(i=1;i<=4;i++)
       {
           for(j=1;j<=4;j++)
        {
            if(i==1 || i==4 ||  j==1 || j==4 )
             System.out.print("*");
            else
             System.out.print(" ");
        }
        System.out.println();
       }
    }
    public static void main(String args[])
    {
        p7 ob = new p7();
        ob.logic();
    }
}