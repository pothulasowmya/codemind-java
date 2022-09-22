import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int r;
        float area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(float)3.14*r*r;
        System.out.printf("%.2f",area);
    }
}