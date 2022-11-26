import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        while(t>0)
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x[]=new int[a+b];
        for( i=0;i<a+b;i++)
          x[i]=sc.nextInt();
        Arrays.sort(x);
        for( i=0;i<a+b-1;i++)
        {
           System.out.print(x[i]+" "); 
        }
        System.out.print(x[a+b-1]);
        System.out.println();
        t--;
        }
    }
}
