import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IoException;

public class EMPDETAILS
{
   public static void main(String[] args)throws IoException
   { 
       FileOutputStream out= new FileNotFoundException("c:emp.txt");
	   String s= "eid , ename , salary";
	   byte [] b=s.getbytes();
	   our.write(b);
	   System.out.println("money")
	   out.close()
	}
}
       