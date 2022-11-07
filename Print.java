import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IoException;
import java.io.PrintStream;

public class printwriter
{ 
   public static void main(String[] args) throws IoException
   {
      FileOutputStream out= new FileNotFoundException("c:abc.txt");
	  PrintStream p= new PrintStream(out);
	  p.print(12);
	  p.print("good");
	  p.print(12.00);
	  p.close();
	  out.close();
	}
}
   

