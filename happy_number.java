
import java.util.*;
class HappyNumber
{
	public static int checkHappyNumber (int number)
	{
		int rem = 0, sum = 0;
		// calculate the sum of squares of each digits
		while(number > 0)
		{
			rem = number %10;
			sum = sum+(rem*rem);
			number = number/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		//Take number from KeyBoard
		Scanner sc = new Scanner (System.in);
		System.out.print("");
		int number = sc.nextInt( );
		int result = number;
		while (result != 1 && result != 4)
		{
			result = checkHappyNumber(result);
		}
		if (result ==1)
		{
			System.out.println ("True");
		}
		else
		{
			System.out.println ("False");
		}
	}
}
