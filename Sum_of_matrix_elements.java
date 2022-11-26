
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,m,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            sum=sum+sc.nextInt();
        }
        
        System.out.println(sum);
    }
}
