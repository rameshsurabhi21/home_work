package geekster;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		x = scan.nextInt();
		int arr[] = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = scan.nextInt();
			if(arr[i] == 0) {
				zero++;
			}
			else if(arr[i]>0) {
				pos++;
			}
			else {
				neg++;
			}
		}
		System.out.println("Positive Number "+pos+'\n'+"Negative Number "+neg+'\n'+"Zero            "+zero);
		scan.close();
	}

}