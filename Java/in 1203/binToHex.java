package lecture11;
import java.util.Scanner;
public class binToHex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a binary number to convert to Hex: ");
		int numBin = sc.nextInt();
		sc.close();
		int power = 0, res = 0;

		while(numBin > 0)
		{
			res = res + ((numBin%2)*(int)(Math.pow(2,power))); // extract last digit and add to red
			power++; // increase the power
			numBin = numBin / 10;  // get rid of last digit
		}
		System.out.println("Num in Decimal is: " + res);
		String digits = new String("0123456789ABCDEF");
        String number = new String("");

        int digit = 0;
        while(res > 0)
		{
			digit = res % 16;
			number = digits.charAt(digit) + number;

			res = res/16;
		}

        System.out.println(number);
	}
}