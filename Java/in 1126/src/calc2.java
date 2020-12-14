package lecture10;

import java.util.Scanner;
public class calc2
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			float f1 =0.0f, f2 = 0.0f;
			String s1 = new String("");
			char operator = ' ';
			System.out.println("Please enter a decimal point number: ");
			f1 = Float.parseFloat(sc.nextLine());
			System.out.println("Please enter a character: ");
			s1 = sc.nextLine();
			operator = s1.charAt(0);
			System.out.println("Please enter a second decimal point number: ");
			f2 = Float.parseFloat(sc.nextLine());


			if(operator == '+')
			{
				System.out.println(f1 + " + " + f2 + " = " + (f1+f2));
			}
			else if(operator == '-')
			{
				System.out.println(f1 + " - " + f2 + " = " + (f1-f2));
			}
			else if(operator == 'x') //cant use * as it is a special character
			{
				System.out.println(f1 + " x " + f2 + " = " + (f1*f2));
			}
			else if(operator == '/')
			{
				System.out.println(f1 + " / " + f2 + " = " + (f1/f2));
			}
			else
			{
				System.out.println("invalid character entered"); // dont use $ % etc
			}


	}
}