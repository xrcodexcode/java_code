public class p12 
{
    int i, j,n;
    void logic() 
    {
        n=65;
        for (i = 65; i <= 69; i++) 
        {
            for (j = 69; j >= i; j--) {
                System.out.print((char) n);
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        p12 ob = new p12();
        ob.logic();
    }
}
