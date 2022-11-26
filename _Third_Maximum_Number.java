import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            list1.add(sc.nextInt());
        for(int i:list1)
        {
            if(!list2.contains(i))
              list2.add(i);
        }
        Collections.sort(list2);
        try
        {
            System.out.print(list2.get(list2.size()-3));
        }
        catch(Exception e)
        {
            System.out.print(list2.get(list2.size()-1));
        }    
        
    }

       
}