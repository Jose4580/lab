class tread2 extends Thread
{
   public void run()
   {
      System.out.println("good");
    }
}
public class threaddem
{
  public static void main (String[] args)
  {
     thread2 t=new tread2();
     t.start();
     t.setName("jesus");
     System.out.println(t.getName());
   }
}