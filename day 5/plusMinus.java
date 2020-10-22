import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int pos1 =0;
        int neg1 = 0;
        int zero1 = 0;
        float pos,neg,zero;

        for (int i=0;i<arr.length;i++)
        { if (arr[i]>0)
           { pos1=pos1+1;}
          else if (arr[i]<0)
           { neg1=neg1+1;}
           else  
           { zero1=zero1+1;}    }

          
           int len=arr.length;
           pos=(float)pos1/len;
           neg=(float)neg1/len;
           zero=(float)zero1/len;

            System.out.println(pos);
           System.out.println(neg);
           System.out.println(zero);
           //System.out.println(pos+'\n'+neg+'\n'+zero);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
