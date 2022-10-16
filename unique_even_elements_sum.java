import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],j,i,r,m=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            r=x[i];
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(x[j]==x[i] && i!=j)
                    {
                      x[j]=-999;  
                    }
                }
                if(x[i]%2==0)
                m+=x[i];
            }
            
        }
        System.out.println(m);
    }
}
