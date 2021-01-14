package lecture11;
import java.util.Scanner;
public class decToHex
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a decimal number to convert to hex:");
		String number = new String(""); // string to store the hex representation
		String digits = new String("0123456789ABCDEF");
		int num = Integer.parseInt(sc.nextLine());
		int position = 0;

		System.out.println("Num: " + num);
		while(num > 0)
		{
			position = num % 16;
			number = digits.charAt(position) + number;

			num = num/16;
		}
		System.out.println("Hexadecimal number: " + number);
	}
}