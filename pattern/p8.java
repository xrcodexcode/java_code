public class p8
{
    int i,j;
    void logic()
    {
        int n = 5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        p8 ob = new p8();
        ob.logic();
    }
}
    