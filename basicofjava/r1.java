import java.util.*;
public class r1
{
    void swap(int a , int b)
    {
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("A VALUE AFTER SWAPING:"+a);
       System.out.println("B VALUE AFTER SWAPING:"+b);
       
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A:");
        int a= in.nextInt();
        System.out.println("ENTER THE VALUE OF B:");
        int b=in.nextInt();
        System.out.println("Value of A BEFORE SWAPING:"+a);
        System.out.println("Value of b BEFORE SWAPING:"+b);
        r1 ob = new r1();
        ob.swap(a,b);
        
    }
}