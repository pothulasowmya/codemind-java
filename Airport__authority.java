import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
        int t=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]<=t)
              p=p+1;
            else
              p=p+2;
        }
        System.out.println(p);
    }
}