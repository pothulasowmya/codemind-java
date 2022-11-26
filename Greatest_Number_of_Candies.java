import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
        int k=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(m<x[i])
              m=x[i];
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]+k>=m)
              System.out.print("True ");
            else
              System.out.print("False ");
        }
   }
}