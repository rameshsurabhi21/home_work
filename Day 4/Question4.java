package geekster;
import java.util.Arrays;
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		System.out.println("please input number : ");
		Scanner scan = new Scanner(System.in);
		int num  = scan.nextInt();

		int[] arr = new int[num];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=0;i<num; i++) {
			if(i>=2) {
			arr[i] = arr[i-2]+arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr)); 
	}
    
}