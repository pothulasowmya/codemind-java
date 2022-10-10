import java.util.Scanner;
 class sample
 {
     public static void main(String args[])
     {
         int n,x[],i,c=0,a,b;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         x=new int[n];
         for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<a ||x[i]>b)
            {
                System.out.print(x[i]+" ");
                c++;
            }
        }
        if(c==0)
           System.out.println("-1");
     }
 }