import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,c=0,r;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        r=x[0];
        for(i=0;i<n;i++)
        {
            if(r>x[i])
            r=x[i];
        }
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                c++;
                if(r<x[i])
                 r=x[i];
            }
        }
        if(c!=0)
        System.out.println(r);
        else
        System.out.println("-1");
    }
}