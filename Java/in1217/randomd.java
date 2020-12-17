package lecture13;

//This program will fill a 2D array with random number between 0 and 200
//It will then calculate the sum of the contents of the array

import java.util.Scanner;
import java.util.Random;
public class randomd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("How many rows would you like in your array: ");
		int rows = sc.nextInt();
		System.out.println("How many cols would you like in your array: ");
		int cols = sc.nextInt();
		int sum = 0;

		int ar[][] = new int[rows][cols];
		//Loop through the array and fill each element with a random number
		//It will then get the sum of all of the elements in the array
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols ; j++)
			{
				ar[i][j] = rd.nextInt(201);
				sum += ar[i][j];
			}
		}

		//Print out array
		System.out.println("The contents of the array are: ");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols ; j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The sum of the contents of the array is: " + sum);
	}
}