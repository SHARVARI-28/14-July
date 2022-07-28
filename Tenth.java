
public class Tenth {

	public static void main(String[] args) {
		int count = 1, num= 2;
		for(int i=num;i<=1000;i++){
			if (i%2 == 0 && i%3==0 && i%5==0)
			{
				num=i;
				System.out.println(i+" ");
				count++;
			}
			if(count>5) {
				break;
			}
		}
		}
	}
