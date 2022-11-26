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
        int c=0;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(x[i]==x[j])
                 c++;
           }
           if(c>n/2)
           {
             System.out.println(x[i]);
             break;
           }
           c=0;
        }
    }
}
