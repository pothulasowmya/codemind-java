import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int x1[]=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
          x1[i]=x[i]*x[i];
        Arrays.sort(x1);
        for(int i=0;i<n;i++)
          System.out.print(x1[i]+" ");
    }
}
