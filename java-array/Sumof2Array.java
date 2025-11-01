import java.util.*;
public class Sumof2Array
{
    int[] arr1;
    int[] arr2;
    int[] arr;
    int l,i,j,k,x,y,z;
    void input()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the length of first array");
       l=in.nextInt();
       arr1 = new int[l];
       arr2 = new int[l];
       arr = new int[l];
       System.out.println("_____________Enter first array_____________");
       for(i=0;i<l;i++)
       {
           System.out.print("Enter the value in the cell");
           arr1[i]=in.nextInt();
       }
       System.out.println("_____________Enter second array_____________");
       for(j=0;j<l;j++)
       {
           System.out.print("Enter the value in the cell");
           arr2[j]=in.nextInt();
       }
    }
    void logic()
    {
        for(k=0;k<l;k++)
        {
            arr[k]=arr1[k]+arr2[k];
        }
    }
    void output()
    {
        System.out.println("_____________First Array_____________");
        System.out.print("[");
        for(x=0;x<l;x++)
        {
            System.out.print(arr1[x]+",");
        }
        System.out.println("]");
        System.out.println("\n");
        System.out.println("_____________Second Array_____________");
        System.out.print("[");
        for(y=0;y<l;y++)
        {
            System.out.print(arr2[y]+",");
        }
        System.out.println("]");
        System.out.println("\n\n");
        System.out.println("_____________Sum of both  Array_____________");
        System.out.print("[");
        for(z=0;z<l;z++)
        {
            System.out.print (arr[z]+",");
        }
        System.out.println("]");
    }
    public static void main(String args[])
    {
        Sumof2Array ob = new Sumof2Array();
        ob.input();
        ob.logic();
        ob.output();
        
    }
}
