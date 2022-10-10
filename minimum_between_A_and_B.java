import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],s=0,r=0,c=0,b,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        r=x[n-1];
        for(int i=0;i<n;i++)
        {
            if((x[i]>=a) && (x[i]<=b))
            {
                if(r>x[i])
                {
                    r=x[i];
                    c++;
                }
                
            }
        }
        if(c>0)
           System.out.println(r);
        else
            System.out.println("-1");
    }
    
}