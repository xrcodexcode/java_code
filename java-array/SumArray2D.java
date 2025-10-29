import java.util.Scanner;

public class SumArray2D 
{
    int[] arr;
    int sum = 0;

    // Constructor to take input and calculate sum
    SumArray2D() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
    }

    void display() 
    {
        System.out.println("Sum of array elements: " + sum);
    }

    public static void main(String[] args) 
    {
        SumArray2D obj = new SumArray2D(); // constructor runs
        obj.display();
    }
}
