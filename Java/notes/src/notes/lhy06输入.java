package notes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lhy06输入 {

	public static void main(String[] args) {
//写在最前面
		/*
		 目前最常用的方法就是
		 import java.util.Scanner; 
		 Scanner A = new Scanner(System.in);
		 String B = A.nextLine ;  
		  
		 */
		
		
// 1. JAVA Input

		//此时需要run的时候使用run configuration 来输入参数（替代使用cmd输入的办法）
		/*使用空格来分开两个Strings，计算的时候只会计算一次空格
          hello world         和 hello              world   是一样的
                   另外，直接回车换行也可以进行分隔
		*/
		
		//预留两个空的字符串待我们输入（所以要输入完才可以运行） 就像int x 一样
		String fname = new String(args[0]);
		String lname = new String(args[1]);
		
		//int num1 = Integer.parseInt(args[0]);  输入的参数是int，实际上是输入字符串后强制转换了。其它同理
		
	
		
		System.out.println("First name: " + fname);
		System.out.println("Last name: " + lname);
		
		//和C不一样，如果输入的参数不足（如只输入了一个），运行会失败。而输入过多，只会运行前X个输入的参数。（X是之前预留的字符串数）


		String s1 = new String(""), s2 = new String(""), s3 = new String("");
		int num1 = 0 , num2 = 0;
		char operator = ' ';
		s1 = args[2];//第一个数字
		
		s2 = args[3];//运算符
		
		s3 = args[4];//第二个数字
		
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s3);
		operator = s2.charAt(0); 
		
		//利用if语句选择运算方式
		if(operator == '+')
		{
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}
		else if(operator == '-')
		{
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}
		else if(operator == 'x') //cant use * as it is a special character
		{
			System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
		}
		else if(operator == '/')
		{
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
		else
		{
			System.out.println("invalid character entered"); // dont use $ % etc
				
	     }
		
		/*
		◼ nextInt() // 将读入的东西设置为Int
		◼ nextFloat() // 设置为float
		◼ nextDouble() // 设置为double
		◼ nextLine() // 设置为String    （注意没有char的命令）
		◼ hasNextInt() //如果有另外一个int读入，将结果返回为ture 
		◼ hasNextFloat() 
		◼ hasNextDouble()
		◼ hasNextLine() 
		◼ Look at the API for a full list of methods …
		*/
		
		Scanner sc = new Scanner(System.in);		
		//利用键盘输入，此时就不要run configuration了
		//记得将import java.util.Scanner; 写在最开头 
		
		String fname2 = new String(""), lname2 = new String("");//创建两个空Sring 就像int X = 0一样
		
		System.out.println("Please enter your first name: ");
		fname2 = sc.nextLine();//读入键盘输入，并且将其定义为String
		
		System.out.println("Please enter your last name: ");
		lname2 = sc.nextLine();
		
		System.out.println("First name: " + fname2);
		System.out.println("Last name: " + lname2);
		
		
		
//Exceptions and Errors
		//程序可以从异常（Exceptions）中恢复，无法从错误（Error）中恢复
		Scanner sc1 = new Scanner(System.in);
		try {
			int nextInteger = sc1.nextInt();
			System.out.println(nextInteger);
			while(sc1.hasNext()) {
				String str = sc1.next();
				if(str.equals("q")) break;
				int value = Integer.parseInt(str);
				System.out.println(value);
			}
			
		}catch (InputMismatchException ime ) {
			sc1.close();
			ime.printStackTrace();
			
		}catch (NumberFormatException nfe ) {
			sc1.close();
			nfe.printStackTrace();
		}
		System.out.println("At the end of the program");

	}

}
