import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(x[i]<=x[i+1])
            {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
        System.exit(0);
    }
}