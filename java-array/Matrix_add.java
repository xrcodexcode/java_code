import java.util.*;
public class Matrix_add 
{
    int i,j,l,r,c,x,y;
    int[] arr2;
    int[] arr1;
    int[] arr;
    void input()
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the row");
      r=in.nextInt();
      System.out.println("Enter the column");
      c=in.nextInt();
      arr=new int[r][c];
      arr1 = new int[r]][c];
      arr2 = new int[r][c]
      System.out.println("Enter the first matrix");
      for(i=0;i<l;i++)
      {
        for(j=0;j<l;j++)
         {
          System.out.print("Enter the value in cell"); 
          arr1[i][j]=in.nextInt();
         }
      }
      System.out.println("Enter the second matrix");
      for(i=0;i<l;i++)
      {
        for(j=0;j<l;j++)
         {
          System.out.print("Enter the value in cell"); 
          arr2[i][j]=in.nextInt();
         }
      }
    }
    void add()
    {
      for(x=0;x<l;x++)
      {
       for(y=0;y<l;y++)
        arr[x][y]=arr1[x][y]+arr[x][y];
      }
    }
}
