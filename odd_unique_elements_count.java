import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],j,i,r,m=0,c=0;
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
                if(r%2!=0)
                m++;
            }
            
        }
        System.out.println(m);
    }
}
