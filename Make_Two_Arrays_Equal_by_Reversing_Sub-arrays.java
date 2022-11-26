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
        int m = sc.nextInt();
        int x1[]=new int[m];
        for(int i=0;i<m;i++)
          x1[i]=sc.nextInt();
        int c=0,p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(x[i]==x1[j])
                  c++;
                else
                {
                    p=1;
                    break;
                }
            }
            
        }
        if(c!=0)
          System.out.print("True");
        else
          System.out.println("False");
    }
}
