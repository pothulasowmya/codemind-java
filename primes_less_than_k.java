import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
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
        int n,x[],k,count=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isPrime(x[i]))
            {
                if(x[i]<=k)
                  count++;
            }
        }
        System.out.println(count);
    }
}