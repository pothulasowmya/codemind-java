import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,s=0,c=0;
        float a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s+=x[i];
        }
        a=(s/n);
        for(i=0;i<n;i++)
        {
            if(x[i]>=a)
            c++;
        }
        System.out.println(c);
    }
}