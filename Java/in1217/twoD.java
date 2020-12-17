package lecture13;

public class twoD
{
	public static void main(String args[])
	{
		char ar[][] = new char[4][5];
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 5; col++)
			{
				ar[row][col] = '*';
			}
		}

		System.out.println("Number of rows: " + ar.length);
		System.out.println("Number of cols: " + ar[0].length);

		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 5; col++)
			{
				System.out.print(ar[row][col]);
			}
			System.out.println();
		}
	}
}