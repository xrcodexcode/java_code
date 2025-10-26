import java.util.*;
public class niven
{
    int num,n,a,s;
    void input()
    {
        Scanner in = new Scanner(System.in); 
        System.out.println("ENTER THE NUMBER:");
        num=in.nextInt();
    }
    void logic()
    {
        s=0;
        n=num;
        while(n!=0)
        {
            a=n%10;
            s+=a;
            n=n/10;
        }
    }
    void output()
    {
       if(num%s==0)
        System.out.println("It is a niven number");
       else
        System.out.println("It is not a niven number");
    }
    public static void main(String args[])
    {
        niven ob = new niven();
        ob.input();
        ob.logic();
        ob.output();
    }
}