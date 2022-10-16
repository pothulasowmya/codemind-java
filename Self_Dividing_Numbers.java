import java.util.Scanner;
class sample
{
    public static boolean self(int n)
    {
        int sum=0,c=0,m,r;
        m=n;
        while(n>0)
        {
            r=n%10;
            c++;
            if(r!=0)
            {
                if(m%r==0)
                sum++;
            }
            n=n/10;
        }
        if(c==sum)
           return true;
        else 
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=sc.nextInt();
        for(int i=n;i<=r;i++)
        {
        if(self(i))
          System.out.print(i+" ");
        }
    }
}
       