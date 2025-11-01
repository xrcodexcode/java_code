import java.util.*;
class Sec_Array
{
    int i,j,l,max,se_max,k,x;
    int[] arr;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length in Array:");
        l=in.nextInt();
        arr=new int[l];
        for(i=0;i<l;i++)
        {
            System.out.print("Enter the element in the cell:");
            arr[i]=in.nextInt();
        }
    }
    void max()
    {
        max=arr[0];
        for(j=0;j<l;j++)
        {
            if(arr[j]>max)
                max=arr[j];
        }
    }
    void sec_max()
    {
        se_max=Integer.MIN_VALUE;
        for(k=0;k<l;k++)
        {
            if(arr[k]>se_max && arr[k]!=max)
                se_max=arr[k];
        }
    }
    void print()
    {
        System.out.print("[");
        for(x=0;x<l;x++)
            System.out.print(arr[x]+",");
        System.out.println("]");
        System.out.println("The largest number="+max);
        System.out.println("The second largest number is "+se_max);
    }
    public static void main(String args[])
    {
        Sec_Array ob = new Sec_Array(); 
        ob.input();
        ob.max();
        ob.sec_max();
        ob.print();
    }
}