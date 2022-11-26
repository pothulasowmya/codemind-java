import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++)
        {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        {
          int k=x[n-1];
          for(int j=n-1;j>0;j--)
          {
              x[j]=x[j-1];
          }
          x[0]=k;
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(x[i]+" ");
        }
           System.out.print(x[n-1]);
        System.out.println();
        }
    }
}