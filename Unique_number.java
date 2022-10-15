import java.util.Scanner;  
class Sample 
{
    public static void main(String args[])  
    {
       Scanner sc = new Scanner(System.in);
       int n;
       n=sc.nextInt();
       String str= Integer.toString(n);
       int length=str.length();
       int c=0,i,j;
       for(i=0;i<length-1;i++)
       {
           for(j=i+1;j<length;j++)
           {
               if(str.charAt(i)==str.charAt(j))
               {
                   c++;
                   break;
               }
           }
       }
       if(c==0)
       {
           System.out.println("Unique Number");
           
       }
       else
       {
           System.out.println("Not Unique Number");
           
       }  
    }  
}  
