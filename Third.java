import java.util.Scanner;
public class Third {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF YOUR CHOICE:");
		int num=sc.nextInt();
		int count = 0;
		for(int i=2;i < num/2;i++)
		{
			if(num % i ==0) {
				count++;
			}
			else {
				continue;
			}
		}
if(count==0) {
	System.out.println("Number is prime");
}
else {
	System.out.println("Number is Not Prime");
}
	}

}
