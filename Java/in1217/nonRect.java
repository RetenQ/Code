package lecture13;

public class nonRect
{
	public static void main(String args[])
	{
		int ar[][] = new int[5][];
		ar[0] = new int[5];
		ar[1] = new int[4];
		ar[2] = new int[3];
		ar[3] = new int[2];
		ar[4] = new int[1];

		for(int i = 0; i < ar.length ; i++)
		{
			for(int j = 0; j < ar[i].length ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}