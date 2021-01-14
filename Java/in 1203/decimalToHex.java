package lecture11;
import java.util.Scanner;
public class decimalToHex
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a decimal number to convert to hex: ");
		int num = Integer.parseInt(sc.nextLine());
		
		String digits = new String("0123456789ABCDEF");
		String number = new String("");
		int position = 0;
		
		while(num > 0)
		{
			position = num % 16;
			number = digits.charAt(position) + number;
			num = num / 16;
		}
		
	System.out.println("Hex: " + number);	
	}
}