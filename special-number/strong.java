import java.util.*;
import java.util.Scanner;

public class strong
{
    int n,num,s,a,i,f;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num=in.nextInt();
    }
    void logic()
    {
        s=0;
        f=1;
        n=num;
        while(n!=0)
        {
            a=n%10;
            f=1;//restart factorial
            for(i=1;i<=a;i++)
             f*=i;
            s+=f;
            n=n/10;
        }
    }
    void output()
    {
        if(s==num)
         System.out.println("Perfect Number");
        else
         System.out.println("Not a Perfect number");
    }
    public static void main(String args[])
    {
        strong ob = new strong();
        ob.input();
        ob.logic();
        ob.output();
    }
}