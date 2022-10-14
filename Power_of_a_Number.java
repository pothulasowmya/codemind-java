import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        double a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=Math.pow(a,b);
        e=d%c;
        System.out.println(String.format("%.0f",e));
    }
}