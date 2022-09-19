import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int x)
    {
        if(x<2)
        return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
          if(x%i==0)
          {
           count++;
          }
        }
        if(count==0)
        {
         return true;
        }
        else 
        {
          return false;
        }
    }
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      int n,x[],c=0,i;
       n=sc.nextInt();
       x=new int[n];
      for(i=0;i<n;i++)
      {
        x[i]=sc.nextInt();
        if(isPrime(x[i]))
        {
         c++;
        }
      }
   System.out.println(c);
}
}