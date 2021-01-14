import java.util.Scanner;

public class in1203 {

	public static void main(String[] args) {
/*在从部分右到左的排序系统中，对于1202，其定位 (位权) 如下
  4 2 0 2
  3 2 1 0      */ 
		
	//十转二
		System.out.println("十转二" );

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
		
	//二转十	
		System.out.println(" " );
		System.out.println("二转十" );

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter a binary number");
		int num1 = Integer.parseInt(sc1.nextLine());

		System.out.println("Your number is: " + num1);
		int position = 0, sum = 0;
		while(num1 > 0)
		{
			if(num1%10 == 1)//得到个位数，且个位数是1的时候才计算
			{
				sum = sum + (int)(Math.pow(2,position));//进行1的2的n次方的计算，以及结果的累加
				            //(X)(Math.pow(m,n))  m的n次方的结果是X类型
				// System.out.println("Sum: " + sum);
			}
			position++;
			num1 = num1 / 10;//“去除”个位数
		}
		System.out.println("Decimal number: " + sum);
		
	//十转十六
		System.out.println(" " );
		System.out.println("十转十六" );
		
		Scanner sc11 = new Scanner(System.in);
		System.out.println("Please enter a decimal number to convert to hex: ");
		int num11 = Integer.parseInt(sc11.nextLine());
		
		String digits = new String("0123456789ABCDEF");//0-F的预设表
		String number1 = new String("");
		int position1 = 0;
		
		while(num11 > 0)
		{
			position1 = num11 % 16; 
			number1 = digits.charAt(position1) + number1; //利用pisition1 去digits中得到相应的数
			num11 = num11 / 16;
		}
		
	System.out.println("Hex: " + number1);
	
	//二转十六
	System.out.println(" " );
	System.out.println("二转十六" );
	
	Scanner sc111=new Scanner(System.in);
	System.out.println("Please enter a binary number to convert to Hex: ");
	int numBin = sc111.nextInt();
	sc111.close();
	int power = 0, res = 0;

	while(numBin > 0)
	{
		res = res + ((numBin%2)*(int)(Math.pow(2,power))); // extract last digit and add to red
		power++; // increase the power
		numBin = numBin / 10;  // get rid of last digit
	}
	System.out.println("Num in Decimal is: " + res);
	//先用程序把二进制转化为十进制
	
	String digits1 = new String("0123456789ABCDEF");
    String number11 = new String("");

    int digit = 0;
    while(res > 0)
	{
		digit = res % 16;
		number11 = digits1.charAt(digit) + number11;
		res = res/16;
	}
    //然后，再把转化好的十进制数转化为十六进制

    System.out.println(number11);
		
//下面的内容从PDF 的 62 页开始
	}

}
