import java.util.Scanner;
public class Seventh {


		 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter any number: ");
		 int num=sc.nextInt();
		 
		 for(int i=1;i<= num;i++)
		 {
			 System.out.println();
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }	 
		 }

		 }

	
	

}
