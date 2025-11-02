import java.util.*;

public class Matrix_add 
{
    
    int i, j, r, c;
    int[][] arr2;
    int[][] arr1;
    int[][] arr;

    Matrix_add() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r = in.nextInt();
        System.out.println("Enter the number of columns:");
        c = in.nextInt();

        arr = new int[r][c];
        arr1 = new int[r][c];
        arr2 = new int[r][c];

        System.out.println("Enter the first matrix:");
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                System.out.print("Enter the value in cell [" + i + "][" + j + "]: ");
                arr1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the second matrix:");
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                System.out.print("Enter the value in cell [" + i + "][" + j + "]: ");
                arr2[i][j] = in.nextInt();
            }
        }
        in.close();
      }

  
    void add() {
        for (int x = 0; x < r; x++) 
        {
            for (int y = 0; y < c; y++) 
            {
                arr[x][y] = arr1[x][y] + arr2[x][y];
            }
        }
    }

    void print() {
        System.out.println("\nThe resulting matrix is:");
        for (int x = 0; x < r; x++) 
        {
            for (int y = 0; y < c; y++) 
            {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) 
    {
        Matrix_add ob = new Matrix_add();
        ob.add();
        ob.print();
    }
}