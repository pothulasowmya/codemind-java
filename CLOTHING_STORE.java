import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        int c=0,d=0;
        Arrays.sort(x);
        for(int i=0;i<n-1;i++)
        {
           if(x[i]==x[i+1])
             c++;
            else
             {
                 c++;
                 d=d+c/2;
                 c=0;
             }
        }
         System.out.println(d+c);
    }
}