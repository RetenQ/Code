package lecture13;
import java.util.Scanner;

public class lect1302
{
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		char ar[][] = new char[4][4];
		for(int i = 0; i < 4; i++) // rows
		{
			for(int j = 0; j < 4 ; j++) //cols
			{
				ar[i][j] = '*';
			}
		}
		
		//Print the array
		for(int rows = 0; rows < ar.length ; rows++)
		{
			for(int cols = 0; cols < ar[0].length ; cols++)
			{
				System.out.print(ar[rows][cols]);
			}
			System.out.println();
		}
	}
}




