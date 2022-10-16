import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,n,i,s=1,r,m;
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            r=n%10;
            s=1;
            for(i=1;i<=r;i++)
            {
                s=s*i;
            }
            sum=sum+s;
            n=n/10;
        }
        if(sum==m)
           System.out.println("The number "+m+" is a strong number");
        else 
           System.out.println("The number "+m+" is not a strong number");
    }
}