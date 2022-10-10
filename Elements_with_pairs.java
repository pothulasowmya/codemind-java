import java.util.Scanner;
 class sample
 {
     public static void main(String args[])
     {
         int n,x[],i,s=0;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         x=new int[n];
         for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
           System.out.print(x[i]+" ");
        }
        if(n%2!=0)
         System.out.print("0");
     }
 }