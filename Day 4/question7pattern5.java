package homework;

public class question7pattern5 {

	public static void main(String[] args) {
		 int c=1;
		for (int i = 0; i < 5; i++) {
			 for (int j = 0; j<9-2*i-1 ; j++) {
				 
				 
					System.out.print(" ");
				}
			
			for (int j = 0; j <= 2*i; j++) {
				System.out.print(c);
			}
			System.out.println();
			c=c+1;
		}
	}
}
