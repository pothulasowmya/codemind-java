
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int x[],n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int b=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                  b=b*x[j];
            }
            System.out.print(b+" ");
            b=1;
        }
    }
}
