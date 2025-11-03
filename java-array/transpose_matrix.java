import java.util.*;
public class transpose_matrix 
{
    int i,j;
    int[][] arr;
    int[][] o_arr;
    int r,c;
    void Batman()
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter number of rows in matrix");
     r=in.nextInt();
     System.out.println("enter number of column in matrix");
     c=in.nextInt();
     arr=new int[r]][c];
     for(i=0;i<l;i++)
     {
        for(j=0;j<l;j++)
        {
        
            System.out.print("Enter the element in array at ["+i+"]"+"["+j+"]");
            o_arr[i][j]=arr[j][i];

        }

     }
     in.close();

    }
    public static void main(String args[])
    {
        transpose_matrix ob = new transpose_matrix();
        ob.Batman();
    }
}
