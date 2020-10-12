package geekster;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("please enter n value");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		double sum = 0.00d;
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				sum -= (double)1 / i;
			} else {
				sum += (double)1/ i;
			}
		}
		System.out.println(sum);
		scan.close();
	}
}