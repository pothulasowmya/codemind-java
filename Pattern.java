import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}