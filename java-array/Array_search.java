import java.util.*;
public class Array_search
{
    int i,j,ns,n,k,l;
    int[] arr;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        l=in.nextInt();
        arr=new int[l];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the value in cell:");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number to be search");
        ns=in.nextInt();
    }
    void logic()
    {
        n=0;
        for(j=0;j<10;j++)
        {
            if(ns==arr[j])
             n++;
        }
    }
    void display()
    {
        System.out.print("[");
        for(k=0;k<10;k++)
         System.out.print(arr[k]+",");
        System.out.println("]");
        if(n>=1)
         System.out.println("Number is Present");
        else
         System.out.println("Number is not Present");
    }
    public static void main(String args[])
    {
       Array_search ob = new Array_search();
       ob.input();
       ob.logic();
       ob.display();
    }
}