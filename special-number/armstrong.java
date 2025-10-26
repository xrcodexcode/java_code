import java.util.*;
public class armstrong
{
    int n,num,a,sum;
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=in.nextInt();
    }
    void logic()
    {
        n=num;
        sum=0;
        while(n!=0)
        {
            a=n%10;
            sum+=a*a*a;
            n/=10;
        }
    }
    void output()
    {
        if(num==sum)
         System.out.println("It is a Armstrong number");
        else
         System.out.println("It is not a Armstrong number");
    }
    public static void main(String args[])
    {
        armstrong ob = new armstrong();
        ob.input();
        ob.logic();
        ob.output();
    }
}