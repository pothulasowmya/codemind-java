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
        int c=0;
        for(int i=0;i<n;i++)
        {
           if(x[i]==m)
           {
               System.out.println(i);
               c++;
           }
        }
        if(c==0)
          System.out.println(-1);
             
    }  
}

