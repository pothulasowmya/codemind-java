 import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)!=0&&s.length()==10)
          System.out.println("Valid");
        else
          System.out.println("Invalid");
    }
}