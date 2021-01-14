package lecture11;
import java.util.Scanner;
public class binToDec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a binary number");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("Your number is: " + num);
		int position = 0, sum = 0;
		while(num > 0)
		{
			if(num%10 == 1)
			{
				sum = sum + (int)(Math.pow(2,position));
				System.out.println("Sum: " + sum);
			}
			position++;
			num = num / 10;
		}
		System.out.println("Decimal number: " + sum);
	}
}