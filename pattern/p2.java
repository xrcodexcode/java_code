public class p2
{
    int i,j;
    void display()
    {
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
             System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p2 ob = new p2();
        ob.display();
    }
}