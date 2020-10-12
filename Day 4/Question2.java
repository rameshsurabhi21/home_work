package geekster;

import java.util.*;


public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;

		x = scan.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = scan.nextInt();
		}



		int larger = arr[0];
		int smaller = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>larger) {
				larger = arr[i];
			}
			else if(arr[i]<smaller) {
				smaller = arr[i];
			}
		}
		System.out.println("Largest Number  "+larger+'\n'+"Smallest Number "+smaller);
		scan.close();
	}

}