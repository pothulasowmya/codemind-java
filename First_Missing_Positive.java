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
        Arrays.sort(x);
        int p=0,q=0,s=0;
        for(int i=0;i<n;i++)
        {
           if(x[i]>0)
            {
                p=1;
                q=i;
                break;
            }
        }
        for(int i=q;i<n;i++)
        {
          if(x[i]!=p)
          {
              System.out.println(p);
              s=1;
              break;
          }
          p++;
        }
        if(s==0)
            System.out.print(p);
            
        
    }
}
