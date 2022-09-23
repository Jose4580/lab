import java.util.Scanner
class Student
{
  public static void main(String[] args)
  {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the student name=");
	 Sname=sc.nextString();
	 System.out.println("enter the 1st subject mark:");
	 s1=sc.nextInt();
     System.out.println("enter the 2st subject mark:");
	 s2=sc.nextInt();
     System.out.println("enter the 3st subject mark:");
	 s3=sc.nextInt();
	 System.out.println("enter the 4st subject mark:");
	 s4=sc.nextInt();
     System.out.println("enter the 5st subject mark:");
	 s5=sc.nextInt();
     int total(s1+" "+s2+" "+s3+" "+s4+" "+s5);
	 double avg=total/5;
	 System.out.println("your mark:"+total);
	 System.out.println{"your average:"+avg);
	 
	 
	 if(avg>=40)
     {    
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
   }
}