
public class Fourth {

	public static void main(String[] args) {
		int count=0;
		String prime="";
		
		for(int i=10;i<=100;i++) {
			int c=0;
			for(count=i;count>=1;count--) {
				if(i%count == 0) {
					c = c+1;
					
				}
			}
		
			if(c == 2 ) {
				prime = prime+i+" ";
			}
			
			}
		
		System.out.println(prime);
	
		}

	}


