import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0,count=0;
        float d;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           s+=x[i];
        }
        d=(int)s/n;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=d)
              count++;
        }
        System.out.println(count);
    }
}