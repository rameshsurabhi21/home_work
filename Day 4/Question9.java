package geekster;

import java.util.Scanner;       


public class Question9

{

   public static void main(String[] args)      

   {

       Scanner sc = new Scanner(System.in);    
       System.out.print("Enter the value of x: ");
       double x = sc.nextDouble();  
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();  
       double Sum = 1;        
       for(int i=1;2*i<=n;i++)    
       {
           Sum += (Math.pow(-1,i)*Math.pow(x,2*i))/factorial(2*i); 
       }
       System.out.println("The value of cos(x) = "+Sum);    
   }

   

   static double factorial(int n) 
   {
       double fact=1;
       for(int i=2;i<=n;i++)
       {
           fact = fact*i;     
       }
       return fact;        
   }
}

