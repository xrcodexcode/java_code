public class p11 
{
    int i, j,n;
    void logic() 
    {
        for (i = 69; i >= 65; i--) 
        {
            for (j = 65; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        p11 ob = new p11();
        ob.logic();
    }
}
