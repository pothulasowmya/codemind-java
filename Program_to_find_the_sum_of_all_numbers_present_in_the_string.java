import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int m=0;
        for (int i=0;i<s.length();i++)
        {
          if(Character.isDigit(s.charAt(i)))
          m=m+Character.getNumericValue(s.charAt(i));
        }
        System.out.println(m);
        
    }
 
}