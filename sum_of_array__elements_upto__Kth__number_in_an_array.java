import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],s=0,i,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s+=x[i];
            if(x[i]==a)
            break;
        }
        System.out.println(s);
    }
}