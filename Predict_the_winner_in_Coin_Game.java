import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n%2==0||m%2==0)
          System.out.print("Player 1");
        else
          System.out.print("Player 2");
    }
}