
import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int m=sc.nextInt();
        int x1[]=new int[m];
        for(int i=0;i<m;i++)
          x1[i]=sc.nextInt();
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
          if(x[i]<=s&&x1[i]>=s)
            c++;
        }
        System.out.println(c);
    }
}
