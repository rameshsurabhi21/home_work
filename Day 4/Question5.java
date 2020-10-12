package geekster;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value of n:");
		int input = scan.nextInt();
		double sum = 0.00d;
		for (int i = 1; i <= input; i++) {
			sum += (double)1/ i;
		}	
		System.out.println(sum);
		scan.close();
	}

}