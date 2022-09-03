import java.util.Scanner;
class Sample
{
    public static boolean ispalindrome(int n)
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
        int n,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=sc.nextInt();
        for(int i=n;i<=t;i++)
        {
          if(ispalindrome(i))
          {
          System.out.print(i+" ");
          }
       }
    }
    
}