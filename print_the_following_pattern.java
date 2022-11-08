import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-2;j++)
            {
                System.out.print(j);
            }
            for(j=1;j<=n-3;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}