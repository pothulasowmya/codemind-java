import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int c=0,r=0,k=0;
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]==1)
            {
              c++;
              k=c;
            }
            else 
            {
                if(r<c)
                {
                    r=c;
                    c=0;
                }
            }
        }
        if(k>r)
        System.out.println(k);
        else
        System.out.println(r);
    }
}