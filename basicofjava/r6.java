import java.util.*;
class r6
{
    int num;//gloabl variable
    void table()
    {
      for(int i=1;i<=10;i++)
      {
          int m=i*num;
          System.out.println(num+"X"+i+"="+m);
      }
    }
    public static void main(String args[])
    {
        r6 ob = new r6();
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO PRINT NUMBER'S TABLE");
        ob.num=in.nextInt();//calling global variable
        ob.table();
    }
}