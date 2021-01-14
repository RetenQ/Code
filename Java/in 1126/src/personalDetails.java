package lecture10;

import java.util.Scanner;
public class personalDetails
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = new String(""), address = new String("");
		int year = 0, noSiblings= 0;
		double wages = 0.0;
		
		System.out.println("Please enter your name");
		name = sc.nextLine();
		System.out.println("Please enter your address");
		address = sc.nextLine();	
		System.out.println("Please enter your year of birth");	
		year = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter your wages");
		wages = Double.parseDouble(sc.nextLine());
		System.out.println("Please enter how many siblings you have");
		noSiblings = Integer.parseInt(sc.nextLine());
		
		System.out.println("Hi " + name);
		System.out.println("You live at: " + address);
		System.out.println("Your year of birth is: " + year);
		System.out.println("You earn" + wages);
		System.out.println("You have " + noSiblings + " brothers and sisters");
	}
}