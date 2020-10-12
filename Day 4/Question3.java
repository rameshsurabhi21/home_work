package geekster;

public class Question3  {
    public static void main(String args[])
    {
	int sum, i, rem, num, counter=0;		
	int start = 1;
	int end = 500;
	for(i=start; i<=end; i++)
	{
	   num = i;
	   sum = 0;
	   while(num != 0)
	   {
		rem = num%10;
		sum = sum + rem*rem*rem;
		num = num/10;
	   }
	   if(i == sum)
	   {
		if(counter == 0)
		{
		   System.out.print("Armstrong numbers : ");
		}
		   System.out.print(i + "  ");
		   counter++;
	   }
	}
    }
}