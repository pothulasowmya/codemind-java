import java.util.Scanner;
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
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
             c=c+x[i];
            else
             d=d+x[i];
        }
        if(Math.abs(c-d)%4==0)
          System.out.println("X");
        else 
         System.out.println("Y");
    }
}
