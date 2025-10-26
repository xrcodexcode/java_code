import java.util.*;
import java.util.Scanner;

class r7
{
    int num;
    void sumOfdigit()
    {
             Scanner in = new Scanner(System.in);
             int d,p,n,a=0;
             r7 ob = new r7();//you have to create obj in every method
             System.out.println("ENTER A NUMBER ");
             num=in.nextInt();
             n=num;
             while(n!=0)
             {
                 d=n%10;
                 a+=d;
                 n=n/10;
             }
             System.out.println("SUM OF ALL DIGIT:"+a);
    }
    public static void main(String args[])
    {
        r7 ob = new r7();
        ob.sumOfdigit();
    }
}
