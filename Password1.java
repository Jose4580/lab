import java.io.*;
class Password1
{
   public static void main (String[] args)
   {
      Console c= System.console();
	  System.out.println("Enter the password");
	  char[]ch= c.password1();
	  String pass = String.valueOf(ch);
	  System.out.println("password is"+pass);
    }
}