
import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int c=0;
           int n=sc.nextInt();
           String s=sc.next();
           for(int i=0;i<s.length();i++)
           {
               c=0;
               char a=s.charAt(i);
               for(int j=0;j<n;j++)
               {
                   char b=s.charAt(j);
                   if(Character.compare(a,b)==0)
                      c++;
               }
               if(c==1)
               {
                   System.out.println(s.charAt(i));
                   break;
               }
           }
           if(c!=1)
             System.out.println(-1);
        }
    }
}
