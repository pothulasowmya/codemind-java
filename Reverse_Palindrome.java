import java.util.Scanner;
class Sample
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,temp=n;;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
           return true;
        else
           return false;
    }
    public static int reverse(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int res,s=0,i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n=Math.abs(n);
        s=n+reverse(n);
        for(i=s;;i+=s)
        {
            if(ispalindrome(s))
            {
                System.out.println(s);
                break;
            }
            s=s+reverse(s);
        }
    }
}