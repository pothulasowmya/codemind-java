import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c+=x[i];
            if(k==x[i])
            break;
        }
        System.out.println(c);
    }
}