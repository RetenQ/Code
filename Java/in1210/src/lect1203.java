package lecture12;

public class lect1203
{
	public static void main(String args[])
	{
		//Implement linear search
		//Create array
		//Assume first value is the smallest
		//Work our way through the rest of the array comparing each value against
		//the current smallest value
		//If smaller update the value of smallest and index
		int ar[] = {12, 223, 254, -45, 90, -99, -123, 87, 0};
		int smallest = ar[0];
		int index = 0;
		
		for(int i = 0; i < ar.length ; i++)
		{
			if(ar[i] < smallest) // found a new smaller value
			{
				smallest = ar[i];
				index = i;
			}
		}
		System.out.println("The smallest value in the array is: " + smallest);
		System.out.println("The smallest value is at index: " + index);
	}
}






