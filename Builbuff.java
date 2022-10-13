public class Stringdemo{
     public static void main(String[] args)
	 {
	    StringBuilder k1=new StringBuilder("jesus");
	    StringBuffer k2=new StringBuffer("praise");
		System.out.println(k1.equals(k2));
		System.out.println(k1.reverse());
        System.out.println(k2.append(k1));
		System.out.println(k1.insert(1 ,'j'));
	    System.out.println(k2.delete(0,4));
	}
}