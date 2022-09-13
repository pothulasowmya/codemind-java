import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}