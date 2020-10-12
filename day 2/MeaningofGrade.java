package geekster;
import java.util.Scanner;

public class MeaningofGrade {

	public static void main(String[] args) {
		System.out.println("Please enter Grade in Capital Letters");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		switch (input) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;
		default:
			System.out.println("Please enter a Valid Grade");
			
		}
		sc.close();
	}

}