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
        for(int i=0;i<n/2;i++)
        {
           System.out.print(x[i]+" "+x[n/2+i]+" ");
        }
    }
}