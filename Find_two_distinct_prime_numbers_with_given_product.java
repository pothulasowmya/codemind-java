 import java.util.Scanner;
class prime
{
    public static boolean isprime(int n)
    {
        if(n<2)
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
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                if(isprime(i)&& isprime(n/i))
                {
                    System.out.print(i+" "+n/i);
                    c++;
                    break;
                }
            }
        }
        if(c==0)
          System.out.print(-1);
    }
}