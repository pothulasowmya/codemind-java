import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        int i=0;
        for(i=1;i<=r;i++)
        {
            if (i%2==1)
            {
                System.out.println(n+ " x " +i+" = "+(n*i));
            }
        }
    }
}