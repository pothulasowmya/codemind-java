import java.util.Scanner;
class Sample
{
    public static boolean isprime(int n)
    {
        if(n<2)
           return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
         		count++;
        }
		if (count==0)
			return true;
		else
			return false;
	}
	public static boolean mega(int n)
	{
	    int s=0,c=0,r;
	    while(n>0)
	    {
	        r=n%10;
	        s++;
	        if(isprime(r))
	        {
	            c++;
	        }
	        n=n/10;
	    }
	    if(s==c)
	       return true;
	   else
	       return false;
	}
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isprime(n)  && mega(n))
          System.out.println("Mega Prime");
        else
          System.out.println("Not Mega Prime");
    }
}