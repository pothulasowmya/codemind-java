 import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String si=s.replaceFirst("6","9");
        System.out.print(si);
    }
}