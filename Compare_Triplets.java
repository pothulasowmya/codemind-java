import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int x[],y[];
        Scanner sc=new Scanner(System.in);
        x=new int[3];
        y=new int[3];
        for(int i=0;i<3;i++)
            x[i]=sc.nextInt();
        for(int i=0;i<3;i++)
            y[i]=sc.nextInt();
        int b=0,a=0;
        for(int i=0;i<3;i++)
        {
            if(x[i]<y[i])
              b++;
            if(x[i]>y[i])
              a++;
        }
        System.out.println(a+" "+b);
        
    }
}