public class p1
{
    int i,j;
    void display()
    {
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
             System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p1 ob = new p1();
        ob.display();
    }
}