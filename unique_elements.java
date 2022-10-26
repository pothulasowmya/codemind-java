import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0,j,r;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]!=-999)
            {
            r=x[i];
            for(j=0;j<n;j++)
            {
                if(x[i]==x[j] && i!=j)
                {
                    c++;
                    x[j]=-999;
                }
            }
            System.out.print(x[i]+" ");
            }
        }
    }
}