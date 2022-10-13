public class Stringdemo{
     public static void main(String[] args)
	 {
	    String s1="karthi";
		String s2="vijai";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.concat("tree"));
		System.out.println(s1.replace("r" , "a"));
		System.out.println(s1.split(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(1));
	}
}