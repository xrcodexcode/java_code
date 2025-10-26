public class p4
{
     int i,j;
     void display()
     {
         for(i=1;i<=5;i++)
         {
            for(j=1;j<=i;j++)
              System.out.print(i);
            System.out.println();
         }
     }
     public static void main(String args[])
     {
        p4 ob = new p4();
        ob.display();
     }
}