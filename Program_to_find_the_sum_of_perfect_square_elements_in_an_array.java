import java.util.Scanner;
class sample
{
    public static boolean isperfect(int n)
    {
        int m=(int)Math.sqrt(n);
        int s=m*m;
        if(s==n)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,s=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isperfect(x[i]))
              s+=x[i];
        }
        System.out.println(s);
    }
}