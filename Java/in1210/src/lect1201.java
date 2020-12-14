package lecture12;

import java.util.Random;
import java.util.Scanner;

public class lect1201
{
	public static void main(String args[])
	 {
		int ar1[] = {0, 1, 2, 3 ,4 ,5, 6};
		int ar2[] = {-4, -8, -10, -12, 9, 7, 8};
		
		//copy from ar1 into ar2
		System.arraycopy(ar1, 2, ar2, 0, 2);
		for(int i = 0; i < ar1.length; i++)
		{
			System.out.print(ar2[i] + "\t");
		}
		
	 }
}