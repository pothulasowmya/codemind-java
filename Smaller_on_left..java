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
        int s=x[0];
        for(int i=0;i<n;i++)
        {
           if(x[i]<s)
             s=x[i];
        }
        for(int i=0;i<n;i++)
        {
            int r=x[i];
            int c=0;
            for(int j=i;j>=0;j--)
            {
                if(x[j]<r)
                {
                 r=x[j];
                 c++;
                 break;
                }
            }
            if(c==0)
            System.out.print("-1"+" ");
            else 
             System.out.print(r+" ");
            
        }
    }
}