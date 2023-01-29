import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n-2;i++)
        {
            if((x[i]%2!=0) && (x[i+2]%2!=0))
            if(x[i+1]%2!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}