import java.util.Scanner;
class Sample
{
    public static boolean isprime(int n)
    {
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
        int n,i,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;;i++)
        {
            if(isprime(i))
            {
                a=i;
                break;
            }
        }
        for(i=n;;i--)
        {
            
            if(isprime(i))
            {
                b=i;
                break;
            }
            
        }
        if((a-n)<=(n-b))
           System.out.println(a-n);
        else
            System.out.println(n-b);
    }
}