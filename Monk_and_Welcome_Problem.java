import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int x[],y[],n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            y[i]=sc.nextInt();
        int b=0,a=0;
        for(int i=0;i<n;i++)
        {
           System.out.print(x[i]+y[i]+" "); 
        }
    }
}