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
         Arrays.sort(x);
        int s=x[0],c=0,i;
        for(i=s;i>0;i--)
        {
           c=0;
           for(int j=0;j<n;j++)
           {
               if(x[j]%i!=0)
                {
                    c=1;
                }
           }
           if(c==0)
             break;
        }
        if(c==0)
          System.out.println(i);
        else
          System.out.println("1");
    }
}