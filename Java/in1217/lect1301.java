package lecture13;
//This program will creat a 2D array of user defined size
//The array will be filled with 1 of 4 different characters.
//If the user does not input one of these we will ask them to re-enter the values
import java.util.Scanner;
public class lect1301
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		System.out.println("How many cols: ");
		int cols = Integer.parseInt(sc.nextLine());

		char c = ' ';
		String input = new String("");
		do
		{
			System.out.println("Please enter a char: ");
			input = sc.nextLine();
			c = input.charAt(0);
		}while((c!= '+') && (c != '*') && (c != '-') && (c != '$'));


		for(int i = 1 ; i <= rows; i++)
		{
			for(int j = 1 ; j < cols ; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}





