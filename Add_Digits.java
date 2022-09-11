import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
            if(n==0 && s>9)
            {
                n=s;
                s=0;
            }
        }
        System.out.println(s);
    }
}