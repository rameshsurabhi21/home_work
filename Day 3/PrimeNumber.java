package geekster;

import java.util.Scanner;       


public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt(); 
        
        boolean flag = false;
        for(int i = 2; i <= Math.sqrt(num); ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (flag==false)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

  