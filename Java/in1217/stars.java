package lecture13;

import java.util.Scanner;
public class stars
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		System.out.println("How many rows: ");
		int cols = Integer.parseInt(sc.nextLine());

		char c = '-';
		String ch = new String("");

		do{
			System.out.println("What character would you like to print:");
			ch = sc.nextLine();
			c = ch.charAt(0);
		}while((c !='+') && (c != '*') && (c != '-') && (c!='$'));

		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= cols ; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}