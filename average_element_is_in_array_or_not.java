import java.util.Scanner;
class Sample
{
    public static void main(String args[])
	{
    	int n,x[],i,c=0;
    	float avg;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	x=new int[n];
    	for(i=0;i<n;i++)
    	  x[i]=sc.nextInt();
    	for(i=0;i<n;i++)
    	{
    	    c+=x[i];
    	}
    	avg=(int)c/n;
    	for(i=0;i<n;i++)
    	{
    	    c=x[i];
    	    if(x[i]==avg)
    	    {
    	        c=x[i];
    	        break;
    	    }
    	}
    	if(avg==c)
    	  System.out.println("True");
    	else
    	  System.out.println("False");
	}
}