public class p3
{
    int i,j;
    void display()
    {
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
             System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p3 ob=new p3();
        ob.display();
    }
}