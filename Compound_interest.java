import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double c1=a*(Math.pow((1+b/100),c));
        System.out.printf("%.2f",c1);
        
        
    }
}