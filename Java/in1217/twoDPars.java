package lecture13;

import java.util.Scanner;
public class twoDPars
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows = 0, cols = 0;
		System.out.println("Please enter the number of rows: ");
		rows = sc.nextInt();
		System.out.println("Please enter the number of cols: ");
		cols = sc.nextInt();

		int ar[][] = new int[rows][cols];
		for(int row = 0; row < rows; row++)
		{
			for(int col = 0; col < cols; col++)
			{
				ar[row][col] = 0;
			}
		}
		System.out.println("The array is: ");
		for(int row = 0; row < rows; row++)
		{
			for(int col = 0; col < cols; col++)
			{
				System.out.print(ar[row][col]);
			}
			System.out.println();
		}
	}
}