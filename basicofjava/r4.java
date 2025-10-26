import java.util.*;
public class r4
{
    int y,da,t,m,d;// global variable
    void days()
    {
        y=da/365;
        t=da%365;
        m=t/30;
        d=t%30;
        System.out.println("IN"+d+"DAYS THERE ARE:");
        System.out.println("Years:"+y);
        System.out.println("Months:"+m);
        System.out.println("Days:"+d);
        
        
    }
    public static void main(String args[])
    {
        //int da;
        Scanner in = new Scanner(System.in);
        r4 ob = new r4();
        System.out.println("enter days:");
        ob.da=in.nextInt();// using global variable
        
        ob.days();
        
        
    }
}