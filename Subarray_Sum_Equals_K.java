import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            int d=0;
            if(x[i]==k)
              c++;
            for(int j=i+1;j<n;j++)
            {
                d+=x[j];
                if(d+x[i]==k)
                 c++;
            }
            
        }
        System.out.println(c);
    }
}