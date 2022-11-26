
import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int m=sc.nextInt();
        int s=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]==m)
            {
                System.out.print(i+" ");
                s++;
                break;
            }
            
        }
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]==m)
            {
                System.out.print(i+" ");
                c++;
                break; 
            }
        }
        if(c==0&&s==0)
          System.out.println("-1"+" "+"-1");
    }
}
