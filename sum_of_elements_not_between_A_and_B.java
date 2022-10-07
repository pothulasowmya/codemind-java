import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,A,B,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        A=sc.nextInt();
        B=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<A || x[i]>B)
            sum+=x[i];
               
        }
        System.out.println(sum);
    }
}