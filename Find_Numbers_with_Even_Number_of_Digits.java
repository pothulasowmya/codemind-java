import java.util.*;
class sample
{
    public static boolean even(int n)
    {
        int r,k=0;
        while(n>0)
        {
            r=n%10;
            k++;
            n=n/10;
        }
        if(k%2==0)
          return true;
        else 
          return false;
    }
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
          if(even(x[i]))
            c++;
        }
        System.out.println(c);
    }
}
