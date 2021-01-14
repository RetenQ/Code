package lecture12;

import java.util.Random;
public class randArray
{
	public static void main(String args[])
	{
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10);
		System.out.println(randomInt);
		for(int i = 0; i < 20; i++)
		{
			randomInt = randomGenerator.nextInt(10);
			System.out.print(randomInt + "\t");
		}

		int ar[] = new int[20];
		for(int i = 0; i < 20; i++)
		{
			ar[i] = randomGenerator.nextInt(1000);
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		int i = 5;
		int a = i++; // a = 5, i = 6
		System.out.println(a + " " + i);

		int b = ++a; // b = 6, a = 6
		System.out.println(b + " " + a);

		int j = 10;
int c = j--; // c = 10, j = 9
System.out.println("c: " + c);
System.out.println("j: " + j);

int d = --c; // d = 9, c = 9
 System.out.println("c " + c);
 	System.out.println("d " + d);


	}
}