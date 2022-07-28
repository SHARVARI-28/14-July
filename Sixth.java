import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		int sum;
		for(sum = 0;num > 0; num = num/10)
			sum=sum+(num%10);
		System.out.println(sum);
		

	}

}
