class student
{
   int sid;
   String sname;
   double marks;
       
    void execute(int x,String y,double z)
    {
      sid=x;
      sname=y;
      marks=z;
     }
     void a()
     {
        System.out.println(sid+" "+sname+" "+marks);
      }
}
public class Sample
{
   public static void main (String[] args)
    {
       student s=new student();
       s.execute(10,"vijai",45.0);
       s.a();
    }
}