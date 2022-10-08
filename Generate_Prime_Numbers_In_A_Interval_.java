import java.util.Scanner;
class Sample
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
        int i,a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<b;i++)
        {
            if(isprime(i))
              System.out.println(i);
        }
    }
}