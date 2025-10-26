public class p5
{
    int i,j,k,l,n;
    void upper()
    {
       n=5;
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=i;j++)
            System.out.print("*");
           System.out.println();
       }  
    }
    void lower() 
    {
        for(i=1;i<=n;i++)
       {
           for(j=n-1;j>=i;j--)
            System.out.print("*");
           System.out.println();
       }  
    }
    public static void main(String args[])
    {
        p5 ob = new p5();
        ob.upper();
        ob.lower();
    }
}