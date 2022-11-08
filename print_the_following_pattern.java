import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,l,k;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k>=1;k--)
            {
                System.out.print(i);
            }
             for(l=2;l<=i;l++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}