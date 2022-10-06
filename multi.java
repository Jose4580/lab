package mercy;
public class multiinheritance{
    class Red
    {
         void msg()
         {
            System.out.println("red colour");
          }
     }
     class Green
     {
           void msg()
           {
              System.out.println("Green colour");
            }
      }
      class Yellow extents Red,Green
      {
          void msg3()
          {
              System.out.println("Yellow colour");
           }
       }
       public class Inh2{
                
             public static void main(String[] args){
             Yellow o=new yellow();
      	 o.msg();
            }
  }
