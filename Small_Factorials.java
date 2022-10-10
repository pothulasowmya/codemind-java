import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,s=1,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                s=s*i;
            }
            System.out.println(s);
            t--;
            s=1;
        }
    }
}