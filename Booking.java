import java.util.ArrayList;
import java.util.Scanner;

public class import1 {
	
	
		public static void main(String[] args) {
			
			
		
		String bokingid ;
		
		Scanner n = new Scanner(System.in);
		 System.out.println("Enter boking id ");
		 bokingid=n.next();
		 
		 try
		 {
		 if(bokingid.equals("55555mage") ) 
			 {
		 System.out.println(" Welcome user to jet booking ");
			 }
		 else 	 
		 
		 {
		 throw  new InvalidUser ("wrong id");	 
		 }
		 }
		 catch(Exception e)	 
		 {
		 System.out.println(e);
		
        }
    }
}