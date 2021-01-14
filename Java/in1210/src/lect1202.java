package lecture12;

public class lect1202
{
	public static void main(String args[])
	{
		//Given an array of boolean values	as follows:
		boolean primes[] = new boolean[5];

/*Write code to put contents in to the array.Write code to print the value stored in the first 
 *element of the array. Write code to print the value stored in the last element  of the array.*/
 
		primes[0] = true;
		primes[1] = false;
		primes[2] = false;
		primes[3] = true;
		primes[4] = false;
		
		System.out.println("First value: " + primes[0]);
		System.out.println("Last value: " + primes[4]);
		int len = primes.length;
		System.out.println("Last value: " + primes[len-1]);
		
		for(int i = 0; i <= len; i++)
		{
			System.out.println("The value at element " + i + " is: " + primes[i]);
		}
		
		System.out.println("Array: " + primes);
	}
}