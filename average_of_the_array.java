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
    }
    for(i=0;i<n;i++)
    {
      s=s+x[i];
       count=count+1;
    }
    avg=(float)s/count;
    System.out.printf("%.2f",avg);
    }
}