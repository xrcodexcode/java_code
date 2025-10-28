public class p10
{
    int i,j;
    void logic()
    {
        for(i=65;i<=69;i++)
        {
            for(j=65;j<=i;j++)
             System.out.print((char)j);
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        p10 ob = new p10();
        ob.logic();
}
}