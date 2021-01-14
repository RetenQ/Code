package lecture13;
import java.util.Scanner;
import java.util.Random;

public class lect1303
{
	public static void main(String args[])
	{
		//Create an array with 5 rows
		char ar[][] = new char[5][];
		ar[0] = new char[5];
		ar[1] = new char[4];
		ar[2] = new char[3];
		ar[3] = new char[2];
		ar[4] = new char[1];
		
		for(int i = 0; i < ar.length ; i++)
		{
			for(int j = 0; j < ar[i].length ; j++)
			{
				ar[i][j] = '*';
			}
		}
		for(int i = 0; i < ar.length ; i++)
		{
			for(int j = 0; j < ar[i].length ; j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}





