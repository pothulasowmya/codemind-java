import java.util.*;
class scan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]= new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        Arrays.sort(x);
        for(int i=0;i<n;i++)
          System.out.print(x[i]+" ");
    }
}