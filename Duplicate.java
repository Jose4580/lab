import java.util.Scanner;
class Duplicate
{
   public static void main(String[] args)
   {
      int[] a=new int[4];
	  int[] b=new int[4];
	  System.out.println("enter the array element:");
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<=3;i++)
	  { 
	      a[i]=sc.nextInt();
	    }
		System.out.println("Duplicate array:");
		for(int i=0;i<=3;i++)
		{
		for(int j=i+1;j<=3;j++)
		{
		     if(a[i]==a[j])
			 {
			     b[i]=a[j];
				 System.out.println(b[i]+" "+b[j]);
			 }
		 }
		}
	}
}
		