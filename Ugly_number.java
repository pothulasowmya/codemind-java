 import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=1)
        {
            if(n%5==0)
              n=n/5;
            else if(n%3==0)
              n=n/3;
            else if(n%2==0)
              n=n/2;
            else 
            {
                System.out.print("Not Ugly Number");
                c=1;
                break;
            }
        }
        if(n==1)
          System.out.print("Ugly Number");
    }
}