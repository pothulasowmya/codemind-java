import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%3==0 && n%5==0)
           System.out.println("PlingPlang");
        else if(n%5==0 && n%7==0)
           System.out.println("PlangPlong");
        else if(n%7==0 && n%3==0)
           System.out.println("PlongPling");
        else if(n%7==0)
           System.out.println("Plong");
        else if(n%3==0)
           System.out.println("Pling");
        else if(n%5==0)
           System.out.println("Plang");
        else
           System.out.println(n);
    }
}