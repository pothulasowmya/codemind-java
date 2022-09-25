import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
          x[i]=sc.nextInt();
           k+=x[i];
        }
        System.out.println(k);
    }
}