import java.util.Scanner;
class Sample
{
    public static boolean isprime(int n)
    {
        if(n==1)
         return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        int n,x[],c=0,i,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<=a)
            {
                if(isprime(x[i]))
                c++;
            }
        }
        System.out.println(c);
    }
}