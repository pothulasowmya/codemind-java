import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n-2;i++)
        {
            if((x[i]%2==0) && (x[i+2]%2!=0) || (x[i]%2!=0) && (x[i+2]%2==0))
            c++;
            
        }
        System.out.print(c);
    }
}