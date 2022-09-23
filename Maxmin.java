import java.util.Scanner;
class Maxmin
{
   public static void main(String[] args)
   {
      int[] marks=new int[4];
      int max=marks[0],min=marks[0];
      System.out.println("enter the array element");
	  Scanner sc=new Scanner(System.in);
      for(int i=0;i<=3;i++)
	  {
	       marks[i]=sc.nextInt();
		   if(marks[i]>max)
		   {
		       max=marks[i];
			}
			else if(marks[i]<min)
			{
			    min=marks[i];
			 }
		}
		System.out.println("maximum element is="+max);
		System.out.println("manimum element is="+min);
	}
}