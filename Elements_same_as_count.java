import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,c=0,m=0,r;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            r=x[i];
            c++;
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(x[j]==x[i] && i!=j)
                    {
                        c++;
                        x[j]=-999;
                    }
                }
                if(c==r)
                {
                    System.out.print(c+" ");
                    m++;
                }
                c=0;
            }
        }
        if(m==0)
            System.out.println("-1");
    }
}