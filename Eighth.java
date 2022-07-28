import java.util.Scanner;
public class Eighth {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=sc.nextInt();
		int dig, rev = 0;
		while(number > 0) {
			dig = number % 10;
			rev = rev * 10 + dig;
			number = number/10;
		}
		System.out.println(rev);
	}

}
