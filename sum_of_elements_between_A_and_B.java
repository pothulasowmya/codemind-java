import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],r=0,b,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((x[i]>=a) && (x[i]<=b))
            {
                r+=x[i];
            
            }
                
        }
        System.out.println(r);
    }
    
}