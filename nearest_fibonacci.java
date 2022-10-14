import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n,m,r;
        Scanner sc=new Scanner(System.in);
        c=a+b;
        n=sc.nextInt();
        while(c<=n)
        {
            a=b;
            b=c;
            c=a+b;
        }
        m=Math.abs(b-n);
        r=Math.abs(c-n);
        if(m>r)
          System.out.println(c);
        else if(m==r)
          System.out.println(b+" "+c);
        else
          System.out.println(b);
    }
}