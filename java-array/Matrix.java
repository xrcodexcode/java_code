public class Matrix 
{
    public static void main(String[] args) 
    {
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        // Initialize the matrix
        int value = 1;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = value++;
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
