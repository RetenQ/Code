
public class in_1029 {
//笔记已整合
	public static void main(String[] args) {
//1.
		int a = -100, b = 20;
	    //三元运算符  
		int min = (a < b) ? a : b;
		// (条件运算符)? 判断正确的输出 : 判断错误的输出 ;
		
		System.out.println("Minimum value is: " + min);
		
		int max = (a > b) ? a : b;
		System.out.println("Maximum value is: " + max);
		int abs = (a < 0) ? -a : a;
		System.out.println("Absolute value is: " + abs);
//2.
		double number1 = -15.5, number2 = 10.2, sum = 0.0;
		sum = number1 - number2;
	    char result = '-';

	    result = (sum > 0.0) ? '+' : '-';
	    System.out.println("sum is " + result);
	    
//3.
	    int month = 24;
	    int numDays= 0;
	    switch (month)
	    {case 1: case 3: case 5: case 7: case 8: case 10:
	    case 12: numDays= 31; 
	    
	    //对于 1 3 5 7 8 10 的情况，一律将 numDay 赋值为31
	    break;
	    case 4: case 6: case 9: case 11: numDays= 30;
	    break;
	    case 2: numDays= 28; 
	    break;
	    //对于 4 6 9 11  的情况，一律将 numDay 赋值为31, 2为 28.

	    default:
	    System.out.println("Invalid month.");
	    //设定默认的情况就是除了以上case以为的情况。
	    }
	    
	    System.out.println("Number of Days = " + numDays);
	    //Switch-case 语句  语法应该和C是一样的


//4.
		int num = 77;
		if(num/10 < num%10)
		{
			System.out.println("Ascending Order");
		}
		else if(num/10 > num%10)
		{
			System.out.println("Descending Order");
		}
		else
		{
			System.out.println("Equivalent Order");
		}
//if-else 语句 ，包括else if



		

// L O O P !

//1.
int count1 = 13;
while ( count1 <= 20 )
{
System.out.println("Count is: " + count1 );
count1 ++;

}
/*
 while (条件)
 {
       循环体里的语句; ......
   ...
   一般需要设置一个语句来改变判断值，以免进入死循环。（称这种语句为Update）
   
   *  Java的while写法和C是一样的。      
 }
 */
System.out.println("Count was "+count1 + "  when the condition become false");



//2.for 循环

	
	/*
	 for(初始化值(进入循环前执行的);执行条件 ; update更新参数){
	 
	 
	 语句.........
	 }
	 */
int num1 = 5, sigma = 0;
for(int i = 1; i <= num1; i++) {
	sigma += i;
	System.out.println("This time it is "+sigma );

}
System.out.println("The sigma of " + num1 + " is " + sigma);

//3. do-while
/* 
 初始值
 do{
 语句;
 更新参数
 }while (条件);
 
 
 就是做了一次循环之后，再去检查条件，再去判断是否二次执行条件。  
 
 *语法和 C 相同。
 
 */


//Constant 常数设置   这个数的值不会被改变
final double PI = 3.14159 ; //这里定义了double变量 PI，这个变量是一个常量，它不会改变。
System.out.println("PI is " + PI);


	}

	

}
