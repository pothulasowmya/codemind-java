
import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++)
           x[i]=sc.nextInt();
        int c=0,p=0;
        for(int i=0;i<a;i++)
        {
            int d=0;
            for(int j=0;j<a;j++)
            {
                if(x[i]==x[j])
                  d++;
            }
            if(d>c)
            {
                c=d;
                p=x[i];
            }
            if(d==c)
            {
                if(p>x[i])
                  p=x[i];
            }
        }
        System.out.println(p);
        sc.close();
    }
}