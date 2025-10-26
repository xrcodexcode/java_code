import java.util.*;
public class r3
{
    static void largestnum(int a , int b , int c)
    {
        if(a>b && a>c)
            System.out.println(a+"is the greatest Number.");
        else if(b>c)
         System.out.println(b+"is the greatest Number.");
        else 
         System.out.println(c+"is the greatest Number.");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three number to compare which one is biggest  ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        r3.largestnum(a,b,c); //static method belong to class and an be called without creating object
        //syntax:class_name.method_name()
    }
}