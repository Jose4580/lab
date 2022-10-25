import java.util.Iterator;
import java.util.priorityquee;

public class collectionquee
{
   public static void main(String[] args)
   {
     priorityQueue<String> q=new priorityQueue<>();
     q.add("Work");
     q.add("set");
     q.add("full");
     q.add("bin");
     q.add("def");
     System.out.println(q.peek());
     Iterator<Strng> i=q.iterator();
     While(i.hasNext())
     {
         System.out.println(i.next());
      }
      q.remove();
      q.poll();
    }
}
