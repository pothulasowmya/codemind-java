import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0,r;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            r=x[i];
            for(int j=0;j<n;j++)
            {
               if(r>x[j])
                 c++;
            }
             System.out.print(c+" ");
             c=0;
        }
    }
}
