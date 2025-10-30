import java.util.*;
public class Array_m
{
    int i,j,l,max,min,k;
    int[] arr;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        l=in.nextInt();
        arr= new int[l];
        for(j=0;j<l;j++)
         {
             System.out.println("Enter the number in cell");
             arr[j]=in.nextInt();
             
         }
    }
    void logic()
    {
        i=1;
        max=arr[0];
        min=arr[0];
        while(i<l)
        {
         if(arr[i]>max)
          max=arr[i];
         if (arr[i] < min)
          min=arr[i];
        i++;
        }
    }
    void print()
    {
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
    }
    public static void main(String args[])
    {
        Array_m ob = new Array_m();
        ob.input();
        ob.logic();
        ob.print();
    }
}
