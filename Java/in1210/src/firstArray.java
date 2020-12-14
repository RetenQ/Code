package lecture12;

import java.util.Scanner;
public class firstArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of an array: ");
		int len = sc.nextInt();
		double ar[] = new double[len];

		for(int i = 0; i < ar.length ; i++)
		{
			System.out.println("Please enter a double value for position " + i + " :");
			ar[i] = sc.nextDouble();
		}

		System.out.println("The values entered in to the array are: ");

		for(int i = 0; i < ar.length ; i++)
		{
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		double sum = 0;
		for(int i = 0; i < ar.length ; i++)
		{
			sum += ar[i];
		}
		System.out.println("The sum of all the array values: "+ sum);
		System.out.println("The average of all the array values is: "+ (sum/len));
	}
}