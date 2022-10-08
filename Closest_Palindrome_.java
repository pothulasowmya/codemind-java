import java.util.Scanner;
class Sample
{
    public static boolean ispalindrome(int n)
    {
        int r,s=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(temp==s)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int n,s,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(ispalindrome(i))
            {
               s=i;
               break;  
            }
           
        }
         for(int i=n-1;;i--)
        {
            if(ispalindrome(i))
            {
               k=i;
               break;  
            }
           
        }
        if((s-n)>(n-k))
            System.out.println(k);
        else if((s-n)==(n-k))
            System.out.println(k+" "+s);
        else
            System.out.println(s);
        
    }
}