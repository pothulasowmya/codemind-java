import java.util.Scanner;
class Sample
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n,x[],i,s=0,count=0;
   float avg;
   n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
     x[i]=sc.nextInt();
     s=s+x[i];
    }
    avg=s/n;
     for(i=0;i<n;i++)
    {
      if(x[i]==avg)
      {
       count++;
      }
    }
    if(count>0)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
  }
}