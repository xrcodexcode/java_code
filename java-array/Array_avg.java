import java.util.*;
public class Array_avg
{
    int[] arr;
    int l,i,j,a;
    double avg;
    Array_avg()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        l=in.nextInt();
        arr= new int[l];
        for(i=0;i<l;i++)
         {
             System.out.println("Enter the value in cell");
             arr[i]=in.nextInt();
         }
    }
    void logic()
    {
        j=0;
        a=0;
        while(j<l)
        {
            a+=arr[j];
            j++;
        }
        avg=a/l;
    }
    void print()
    {
       System.out.println("Average="+avg); 
    }
    public static void main(String args[])
    {
        Array_avg ob = new Array_avg();
        ob.logic();
        ob.print();
    }
}