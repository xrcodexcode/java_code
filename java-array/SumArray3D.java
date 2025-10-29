import java.util.*;
public class SumArray3D
{
    int i,j,s;
    int[][] arr;
    SumArray3D()
    {
        Scanner in = new Scanner(System.in);
        arr = new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
             arr[i][j]=in.nextInt();
        }
        s=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
             s+=arr[i][j];
        }
    }
    void display()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
             System.out.print(arr[i][j]+"  ");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Sum of matrix="+s);
    }
    public static void main(String args[])
    {
        SumArray3D ob = new SumArray3D();
        ob.display();
    }
}