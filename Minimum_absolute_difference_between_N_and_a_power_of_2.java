 import java.util.Scanner;
class sample
{
    public static int math(int n)
    {
        for(int i=0;;i++)
        {
            if((int)Math.pow(2,i)<=n&&(int)Math.pow(2,i+1)>=n)
            {
                if(n-(int)Math.pow(2,i)>(int)Math.pow(2,i+1)-n)
                  return (int)Math.pow(2,i+1)-n;
                else
                  return n-(int)Math.pow(2,i);
            }
        }
    }
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.print(math(n));
        }
}