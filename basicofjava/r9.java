import java.util.*;
public class r9
{
    int n,i,nm=1;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=in.nextInt();
    }
    void logic()
    {
       for(i=1;i<=n;i++)
       {
           nm*=i;
       }
    }
    void display()
    {
        System.out.println("Factoriall of "+n+" : "+nm);
    }
}