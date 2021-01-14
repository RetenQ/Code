package lecture10;

import java.util.Scanner;
public class phoneNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		String num = new String(""), international = new String(""), operator = new String(""), number = new String("");
	    //Get input - note that this will not check if length is correct
	   //  System.out.println("Please enter a 12 digit phone number");
		// num = sc.nextLine();
		
		//We want to do something at least once
		do  //how can we check that a valid number is entered?
		{
			System.out.println("Please enter a valid 12 digit phone number");
			num = sc.nextLine();	
		}while(num.length() != 12);
		
		international = num.substring(0,3);
		operator = num.substring(3,5);
		number = num.substring(5);

		System.out.println("The international code is: " + international);
		System.out.println("The operator code is: " + operator);
		System.out.println("The number is: " + number);

		System.out.println("The complete telephone number is: (" + international + ") " + operator + " " + number);
	}
}