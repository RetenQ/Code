package lecture11;
import java.util.Scanner;
public class decToBin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//用键盘输入相应的数
		
		System.out.println("Please enter a number to convert to binary:");
		//输入一个要转换成2进制的10进制
		
		
		String number = new String("");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("Num: " + num);
		while(num > 0)
		{
			number = num%2 + number;//累计余数

			num = num/2;//利用除法运算得到整数部分
		}
		System.out.println("Binary number: " + number);
	}
}