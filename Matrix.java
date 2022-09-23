import java.util.Scanner;
class Matrix
{
  public static void main(String[] args)
  {
     int a[][],b[][],c[][],d[][],i,j;
	 a=new int[3][3];
	 b=new int[3][3];
	 c=new int[3][3];
	 Scanner input= new Scanner(System.in);
     System.out.println("enter the first matrix");
     for(i=0;i<3;i++)
        for(j=0;j<3;j++)
            a[i][j] = input.nextInt();
     
     System.out.println("enter the secind matrix"); 
	 for(i=0;i<2;i++)
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
            b[i][j] = input.nextInt();
			
	 System.out.println("Addition");
	 for(i=0;i<3;i++)
	 {
	    for(j=0;j<3;j++)
		{
		  c[i][j]=a[i][j]+b[i][j];
		  System.out.print(c[i][j]+" ");
		}
     }
	   System.out.println("multiplication");
	   for(i=0;i<3;i++)
	   { 
         for(j=0;j<3;j++)
		 {			 
		   c[i][j]=a[i][j]*b[i][j];
		  System.out.println(c[i][j]+" ");
	     }
		 System.out.println();
	   }
    }		
}