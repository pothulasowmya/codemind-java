import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int t,s,c,d,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*t*s*b*512;
        d=c/1024;
        System.out.println(d+"KB");
    }   
}