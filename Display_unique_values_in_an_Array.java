
import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<a; i++)
            list1.add(sc.nextInt());
        int c=0;
        for(int i : list1)
        {
            if(!list2.contains(i))
                list2.add(i);
        }
        for(int i:list2)
        {
            if(Collections.frequency(list1,i)==1)
            {
              System.out.print(i+" ");
              c++;
            }
        }
        if(c==0)
          System.out.print(-1);
    }
}
