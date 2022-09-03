import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
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
    public static boolean isPalindrome(int n)
    {
        int temp=n;
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
              System.out.println(i);
              break;
            }
        }
       
    }
    
}