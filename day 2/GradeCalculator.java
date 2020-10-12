package geekster;

  
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int avg = (int) (sub1 + sub2 + sub3) / 3;
		
		if (avg > 100 || avg < 0) {
			System.out.println(" Enter valid marks");
		} else if (avg <= 100 && avg >= 90) {
			System.out.println("A");
		} else if (avg <= 89 && avg >= 80) {
			System.out.println("B");
		} else if (avg <= 79 && avg >= 70) {
			System.out.println("C");
		} else if (avg <= 69 && avg >= 60) {
			System.out.println("D");
		} else if (avg <= 0 && avg >= 59) {
			System.out.println("F");
		}
		sc.close();
	}

}

