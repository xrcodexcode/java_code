import java.util.*;
public class r2
{
    void swap(int a , int b)
    {
       int c;
       c=a;//using third variable
       a=b;
       b=c;
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
        r2 ob = new r2();
        ob.swap(a,b);
        
    }
}