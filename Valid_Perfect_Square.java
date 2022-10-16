import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,c,m,t,r;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            m=sc.nextInt();
            r=(int)Math.sqrt(m);
            c=r*r;
            if(c==m)
             System.out.println("True");
            else
             System.out.println("False");
        }
    }
}
       