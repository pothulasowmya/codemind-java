 import java.util.*;
class sample
{
    public static int recurse(int p)
    {
       if(p<0)
         return 0;
       if(p==0)
         return 1;
       return recurse(p-1)+recurse(p-2)+recurse(p-3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(recurse(n));
    }
}